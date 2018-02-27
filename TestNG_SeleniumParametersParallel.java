package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG_SeleniumParametersParallel {
	WebDriver driver;
	String baseURL;

	@BeforeClass
	@Parameters({"browser"})
	public void setUp(String browser) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		baseURL = "https://letskodeit.teachable.com";
		if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		}
	 else if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	 }
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);	
	}

	@Test
	public void setUp() {
		WebElement loginlink = driver.findElement(By.xpath("//a[contains(@href, '/sign_in')]"));
		loginlink.click();
		WebElement emailfield = driver.findElement(By.id("user_email"));
		emailfield.sendKeys("test@email.com");
		WebElement passwordField = driver.findElement(By.id("user_password"));
		passwordField.sendKeys("abcabc");
		WebElement loginButton = driver.findElement(By.name("commit"));
		loginButton.click();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
