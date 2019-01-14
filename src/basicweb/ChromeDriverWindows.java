package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {
	static WebDriver driver;


	public static void main(String[] args) {
		signInToLinkedIn();
	
		
	}
	
	public static String signInToLinkedIn() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ismailyunus/Documents/drivers/chromedriver");
		driver = new ChromeDriver();
		String baseURL = "http://www.google.com";
		//driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("linkedin");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]")).click();
		
		//driver.navigate().back();
		driver.quit();

		return(null);
		
	}
	

}
