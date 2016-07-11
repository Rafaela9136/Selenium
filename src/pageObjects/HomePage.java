package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebDriver driver;
	private static WebElement element;
	
	public HomePage(WebDriver driver) {
		HomePage.driver = driver;
	}
	
	public static WebElement product() {
		element = driver.findElement(By.id("177974507"));
		return element;
	}
	
	public static WebElement cartBtn() {
		element = driver.findElement(By.id("spnCarrinho"));
		return element;
	}	
}

