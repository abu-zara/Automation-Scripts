package usefulmethods;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isElementPresentDemo {
	private WebDriver driver;
	private String baseURL;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abdulkarim.samrumi-boys-HP\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "http://letskodeit.teachable.com/pages/practice";
		gm = new GenericMethods(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	

	@Test
	public void testMethod() throws Exception{
		driver.get(baseURL);
		
		boolean result = gm.isElementPresent("name", "id");
		System.out.println("Is Element present : " + result);
		
		boolean result1 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Is Element present: " + result1);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

}
