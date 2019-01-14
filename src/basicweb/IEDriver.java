package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
		
		String baseURL = "https://www.google.com";
		
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get(baseURL);
		
	}

}
