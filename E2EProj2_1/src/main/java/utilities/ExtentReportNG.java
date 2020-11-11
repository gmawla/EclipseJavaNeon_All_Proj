package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	public static ExtentReports extent;
	
	public static ExtentReports getReportObject(){
	String path = System.getProperty("user.dir")+"\\ExtentReport\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web Automation");
	reporter.config().setDocumentTitle("Automatio Test Results");
	extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester Name", "Mohammed Mawla");
	return extent;
	
	}
}
