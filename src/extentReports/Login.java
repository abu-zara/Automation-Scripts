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
		baseURL = "http://www.letskodeit.com/";
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		
		report = ExtentFactory.getInstance();
		test = report.startTest("verify welcome text");
		driver = new FirefoxDriver();
		hp = new HomePage(driver, test);
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
			
		hp.login("test@email.com", "abcabc");

		Thread.sleep(3000);
		
		boolean result = hp.isWelcomeTestPresent();

		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}

	@AfterClass
	public void afterClass() {
		
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
