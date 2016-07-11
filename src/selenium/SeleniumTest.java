package selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class SeleniumTest {
	
	HomePage home;
	CartPage cart;
	ProductPage product;
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		home = new HomePage(driver);
		cart = new CartPage(driver);
		product = new ProductPage(driver);
	}

	@Test
	public void testAddProduct() {
		driver.navigate().to("http://www.pontofrio.com.br");
		
		HomePage.product().click();
		ProductPage.AddToCartBtn().click();
		Assert.assertTrue(CartPage.completePurchaseBtn().isDisplayed());
	}
	
	@Test
	public void testAccessEmptyCart() {
		driver.navigate().to("http://www.pontofrio.com.br");
		
		HomePage.cartBtn().click();
		// Precisa testar
		Assert.assertTrue(driver.getPageSource().contains("Meu Carrinho"));
		Assert.assertTrue(driver.getPageSource().contains("Não há produtos em seu carrinho."));
	}
}

