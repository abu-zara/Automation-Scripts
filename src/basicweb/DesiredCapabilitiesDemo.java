package basicweb;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilitiesDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver;
		String baseURL = ("https://letskodeit.teachable.com/pages/practice");
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN10);
		
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());

	}

}
