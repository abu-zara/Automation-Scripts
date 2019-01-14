package extentReports;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SeleniumLoginTestWithScreenShots {

	private WebDriver driver;
	private String baseURL;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver",
				"/Users/ismailyunus/Documents/drivers/chromedrivergeckodriver");
		baseURL = "http://www.letskodeit.com/";
		report = new ExtentReports("/Users/ismailyunus/Documents/ExtentReports/logintest.html");
		test = report.startTest("verify welcome text");
		driver = new FirefoxDriver();
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

		WebElement signupLink = driver.findElement(By.xpath("//*[@id=\"comp-iiqg1vggactionTitle\"]"));
		signupLink.click();
		test.log(LogStatus.INFO, "Clicked on signup link");

		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked on login link");

		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys("test@email.com");
		test.log(LogStatus.INFO, "Enter email");

		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter password");

		WebElement goButton = driver.findElement(By.id("memberLoginDialogokButton"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked Go button");

		Thread.sleep(3000);

		WebElement welcomeText = null;

		try {
			welcomeText = driver.findElement(By.id("comp-iiqg1vggmemberTitle"));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}

	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if(testResult.getStatus() == ITestResult.FAILURE) {
			Screenshots.takeScreenshot(driver, testResult.getName());
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
