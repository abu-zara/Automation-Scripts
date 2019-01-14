package testClasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNG_ITestResult {
	
	
	@Test
	public void testMethod1() {
		System.out.println("Running -> testMethod1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		System.out.println("Running -> testMethod2");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		System.out.println(testResult.getMethod().getMethodName());
		if(testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("failed: " + testResult.getMethod().getMethodName());
		}
		if(testResult.getStatus()== ITestResult.SUCCESS) {
			System.out.println("Success: " + testResult.getName());
		}
	}

}
