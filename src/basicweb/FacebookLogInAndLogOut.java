package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogInAndLogOut {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");

		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com.ng/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testFacebookLogInAndLogOut() throws Exception {
		driver.get(baseUrl + "/?gfe_rd=cr&dcr=0&ei=wHSFWtOQNs7BXtSJt9gK");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@id=\"vn1s0p1c0\"]")).click();
		driver.findElement(By.id("u_0_a")).click();
		driver.findElement(By.name("email")).sendKeys("email@provider.com"); // provider = yahoo, gmail, etc
		driver.findElement(By.name("pass")).sendKeys("password");
		
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(10000);
		
		
		
//		driver.findElement(By.xpath("//div[@id='js_79']/div/div/ul/li[17]/a/span/span")).click();
//		driver.findElement(By.id("pass")).clear();
//		driver.findElement(By.id("pass")).sendKeys("ismaila");
	}

//	@After
//	public void tearDown() throws Exception {
//		Thread.sleep(3000);
//		driver.quit();

	//}

}
