package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.BasePage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import utils.ExtentReportManager;

public class Hooks {

    private ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Iniciando Scenario: " + scenario.getName());

        BasePage.initializeDriver();

        extent = ExtentReportManager.getInstance();
        ExtentTest extentTest = extent.createTest("Escenario: " + scenario.getName());
        test.set(extentTest);
    }
        @After
    public void tearDown(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BYTES);

            // captura al reporte de Cucumber
            scenario.attach(screenshot, "image/png", scenario.getName());

            // captura al ExtentReport
            String base64Screenshot = ((TakesScreenshot) BasePage.getDriver()).getScreenshotAs(OutputType.BASE64);
            if (scenario.isFailed()) {
                test.get().fail("Escenario fallido: " + scenario.getName(),
                        MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } else {
                test.get().pass("Escenario exitoso",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }
        } catch (Exception e) {
            test.get().warning("No se pudo capturar screenshot: " + e.getMessage());
        }

        BasePage.closeDriver();
        System.out.println("Finalizado Scenario: " + scenario.getName());
    }

}