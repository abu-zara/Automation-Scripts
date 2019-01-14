package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findAllImages {

	static WebDriver driver;

	public static <Webelement> void main(String[] args) {
		// TODO Auto-generated method stub

		List<WebElement> Elements = driver.findElements(By.xpath("//img[contains(@src, ‘icon_comments_active‘)]"));
		System.out.println(Elements.size());
	}

}
