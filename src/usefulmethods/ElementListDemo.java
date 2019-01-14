package usefulmethods;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import usefulmethods.GenericMethods;

public class ElementListDemo {
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
		
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
