package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		launchFirefoxBrowser();
		
	}
	
	public static void launchFirefoxBrowser(){
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "https://payfer.co.uk";
		
		driver.get(baseURL);
		
	}

}
