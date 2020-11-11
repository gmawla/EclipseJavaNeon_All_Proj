package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	public static ExtentReports extent;
	
	public static ExtentReports getReporterObj(){
		
		String path = System.getProperty("user.dir")+"//ExtentReport//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().getDocumentTitle();
		reporter.config().getReportName();
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mohammed Mawla");
		return extent;
		
		
		
		
	}

}
