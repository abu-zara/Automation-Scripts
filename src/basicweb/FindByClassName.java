package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe\\");
		
		driver = new FirefoxDriver();
		
		String baseURL = "https://www.linkedin.com/uas/request-password-reset?trk=uno-reg-guest-home-forgot-password";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.name("userName")).sendKeys("ismoh4real@yahoo.com");
		driver.findElement(By.className("btn-submit")).click();
	}

}
