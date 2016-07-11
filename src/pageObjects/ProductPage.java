package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
	
	private static WebDriver driver;
	private static WebElement element;
	
	public ProductPage(WebDriver driver) {
		ProductPage.driver = driver;
	}

	public static WebElement AddToCartBtn() {
		element = driver.findElement(By.id("btnAdicionarCarrinho"));
		return element;
	}
	
	public static WebElement continueBtn() {
		element = driver.findElement(By.className("continue-button"));
		return element;
	}

}
