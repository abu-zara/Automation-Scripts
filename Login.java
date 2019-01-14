package extentReports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login {

	private WebDriver driver;
	private String baseURL;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		baseURL = "http://www.letskodeit.com/";
		report = ExtentFactory.getInstance();
		test = report.startTest("verify welcome text");
		driver = new FirefoxDriver();
		hp = new HomePage(driver, test); // the driver has to be initialised first before the homepag else there will be
											// an error
		test.log(LogStatus.INFO, "Browser Started");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		test.log(LogStatus.INFO, "Web application opened");

	}

	@Test
	public void test1_validLoginTest() throws Exception {

		hp.clickSignUpLink();
		hp.clickLoginLink();
		hp.enterEmail("test@email.com");
		hp.enterPassword("abcabc");
		hp.clickgoButton();

		Thread.sleep(3000);

		boolean result = hp.isWelcomeTestPresent();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "verified welcome Text");

	}

	@AfterClass
	public void afterClass() {

		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
