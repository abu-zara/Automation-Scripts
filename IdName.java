package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("linkedin");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
		driver.findElement(By.name("session_key")).sendKeys("ismail.yakareem@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("@password");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
	

	}

}
