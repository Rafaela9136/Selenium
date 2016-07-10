package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private static WebElement element = null;
	
	public static WebElement product(WebDriver driver) {
		element = driver.findElement(By.id("177974507"));
		return element;
	}
	
}
