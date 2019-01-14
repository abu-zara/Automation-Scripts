package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestNG_ReportsAndLogs {

	@BeforeClass
	public void beforeClass() {
		//System.out.println("TestNG_ReportsAndLogs -> This runs once before the class");
		Reporter.log("TestNG_ReportsAndLogs -> this runs once before class", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("TestNG_ReportsAndLogs -> this runs once after class", true);

	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> this runs once before every method", true);

	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> this runs once after every method", true);

	}

	@Test
	public void testMethod1() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod1", true);

	}

	@Test
	public void testMethod2() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod2", true);
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod3() {
		System.out.println("TestNG_ReportsAndLogs -> testMethod1");
		Reporter.log("TestNG_ReportsAndLogs -> testMethod3", true);
		
	}

}
