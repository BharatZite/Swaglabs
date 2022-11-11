package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports CreateReport() {
	ExtentReports 	reports=new ExtentReports();	
		 ExtentSparkReporter  sparkReporter=new ExtentSparkReporter("extentreports.html");
			reports.attachReporter(sparkReporter);
			reports.setSystemInfo("CreatedBy", "Bharat");
			reports.setSystemInfo("TestSuit", "Regression");
	return reports;
	}
	
}
