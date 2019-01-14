package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByLinkText {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe\\");
		
		driver = new FirefoxDriver();
		
		String baseURL = "https://ng.linkedin.com/"; 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(baseURL);
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.findElement(By.partialLinkText("Forgot")).click(); // also path gives same result as above
		
		
		
		
		
		

	}

}
