package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.ProductPage;


public class SeleniumTest {

	@Test
	public void testAdicionarProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.pontofrio.com.br");
		
		HomePage.product(driver).click();
		
		ProductPage.AddToCartBtn(driver).click();
		
		WebElement continueBtn = ProductPage.continueBtn(driver);
		Assert.assertNotNull(continueBtn);
	}
	
	
	@Test
	public void testCarrinhoVazio() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.pontofrio.com.br");
		
		HomePage.product(driver).click();
		
		ProductPage.AddToCartBtn(driver).click();
		
		WebElement continueBtn = ProductPage.continueBtn(driver);
		Assert.assertNull(continueBtn);
	}
	
}
