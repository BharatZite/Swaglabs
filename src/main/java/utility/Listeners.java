package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass  implements ITestListener {

	public void onTestStart (ITestResult result) {
		System.out.println( result.getName()+" test started");
	}
	public void onTestSuccess (ITestResult result) {
		System.out.println(result.getName()+" test is succeed");
	}
	
	public void onTestFailure (ITestResult result) {
//	try {
//		Screenshot.clickScreenshot(driver, result.getName());
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
		System.out.println("test Fail");
	}
	public void onTestSkipped (ITestResult result) {
		System.out.println(result.getName()+" test is skipped");
		}
	
}
