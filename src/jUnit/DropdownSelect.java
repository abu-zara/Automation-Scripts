package jUnit;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testDropdown() throws Exception {
		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("carselect"));
		Select sel = new Select(element);
		
		
		Thread.sleep(2000);
		System.out.println("select Benz by value");
		sel.selectByValue("benz");
		
		Thread.sleep(2000);
		System.out.println("select Honda by index");
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		System.out.println("select BMW by visible text");
		sel.selectByVisibleText("BMW");
		
		Thread.sleep(2000);
		System.out.println("Print the list of all options");
		List<WebElement> options = sel.getOptions();
		int size = options.size();
		
		for (int i=0; i<size; i++) {
			String optionName = options.get(i).getText();
			System.out.println(optionName);
		}
		
		
	}
	
	@After
	public void tearDown() {
		
	}

}
