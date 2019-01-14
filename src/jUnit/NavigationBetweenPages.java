package jUnit;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationBetweenPages {
	WebDriver driver;
	String baseURL; 
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentUrl is : " + currentUrl);

		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
		System.out.println("Navigation To Login");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);

		Thread.sleep(2000);

		driver.navigate().forward();
		System.out.println("Navigate forward");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("Navigate Back");
		currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " + currentUrl);

		driver.navigate().refresh();
		System.out.println("Navigate Refresh");
		driver.get(currentUrl);
		System.out.println("Navigate Refresh");
		
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
