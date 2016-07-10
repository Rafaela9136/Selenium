package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	private static WebElement element = null;
	
	public static WebElement AddToCartBtn(WebDriver driver) {
		element = driver.findElement(By.id("btnAdicionarCarrinho"));
		return element;
	}
	
	public static WebElement continueBtn(WebDriver driver) {
		element = driver.findElement(By.className("continue-button"));
		return element;
	}

}