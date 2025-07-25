package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
              String reportPath = System.getProperty("user.dir") + "/report/ExtentReport.html";
            //String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
            extent = new ExtentReports();
            extent.attachReporter(spark);
            extent.setSystemInfo("Tester", "Joseph Espinoza");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            
        }
        return extent;
    }
}
