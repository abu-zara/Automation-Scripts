package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gokada {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "https://gokada.ng/";
		driver.get(baseURL);
		
		driver.findElement(By.xpath("/html/body/main/div[1]/a/button")).click();
		

	}

}
