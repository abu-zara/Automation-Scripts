package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ultimateqa {

	public static void main(String[] args) {
		launchFirefoxBrowser();
		
	}
	
	public static void launchFirefoxBrowser(){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "https://courses.ultimateqa.com/users/sign_in";
		
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//*[@id='content-push']/div/div/div[2]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id='user_first_name']")).sendKeys("ismoh");
		
		driver.findElement(By.id("user_last_name")).sendKeys("Abu-Zara");
		driver.findElement(By.xpath("html body div.rc-anchor.rc-anchor-normal.rc-anchor-light div.rc-anchor-content div.rc-inline-block div.rc-anchor-center-container div.rc-anchor-center-item.rc-anchor-checkbox-holder span#recaptcha-anchor.recaptcha-checkbox.goog-inline-block.recaptcha-checkbox-unchecked.rc-anchor-checkbox div.recaptcha-checkbox-checkmark")).click();
	}

}
