package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentCucumberAdapter {
    private static ExtentReports extent = ExtentReportManager.getInstance();
    private static ThreadLocal<ExtentTest> feature = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> scenario = new ThreadLocal<>();

    public static void startFeature(String featureName) {
        feature.set(extent.createTest(featureName));
    }

    public static void startScenario(String scenarioName) {
        scenario.set(feature.get().createNode(scenarioName));
    }

    public static void logStep(String message) {
        scenario.get().info(message);
    }

    public static void endReport() {
        extent.flush();
    }
}
