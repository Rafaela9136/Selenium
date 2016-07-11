package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	
	private static WebDriver driver;
	private static WebElement element;
	
	public CartPage(WebDriver driver) {
		CartPage.driver = driver;
	}
	
	public static WebElement completePurchaseBtn() {
		element = driver.findElement(By.id("btnComprar"));
		return element;
	}
}

