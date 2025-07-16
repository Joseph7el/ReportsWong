package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;
import utils.ExtentReportManager;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps", "pages"},
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags = "@Ejecutar"
)
public class TestRunner {

    @AfterClass
    public static void tearDown() {
        // Cerrar navegador
        BasePage.closeBrowser();

        // Guardar reporte Extent
        ExtentReportManager.getInstance().flush();
    }
}