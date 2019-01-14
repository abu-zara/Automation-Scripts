package jUnit;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAction {
	WebDriver driver;
	String baseURL = "http://letskodeit.teachable.com/";

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test() throws Exception {
		driver.get(baseURL);
		driver.findElement(By.xpath("/html/body/header/div/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".navbar-brand > img:nth-child(2)")).click();

	}

}
