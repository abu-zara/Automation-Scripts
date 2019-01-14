package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxToggle {

	static WebDriver driver;

	public static void main(String[] args) {
		
	}

	public static void toggleCheckbox(String xpathToCheckbox, boolean select) {
		WebElement checkbox = (WebElement) driver.findElements(By.xpath(xpathToCheckbox));
		if (checkbox.isSelected()!= select) {
			checkbox.click();
		}
	
		driver.quit();
	}
}