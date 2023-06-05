package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class ListnerImplementation implements ITestListener {

	public void onTestStart(ITestListener result) {
		Reporter.log("Test case started " + ((ITestContext) result).getName());

	}
public void onTestSuccess(ListnerImplementation result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case success " + result.getName());

	}

	private String getName() {
	// TODO Auto-generated method stub
	return null;
}
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case failed " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case skipped " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext  context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
	

	
	
	

	
public ListnerImplementation() {
	// TODO Auto-generated constructor stub
}}
	


