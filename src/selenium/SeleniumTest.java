package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;


public class SeleniumTest {

	@Test
	public void testAdicionarProduto() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.pontofrio.com.br");
		
		WebElement produto = driver.findElement(By.id("177974507"));
		produto.click();
		
		WebElement botao = driver.findElement(By.id("btnAdicionarCarrinho"));
		botao.click();
		
		WebElement continuar = driver.findElement(By.className("continue-button"));
		Assert.assertNotNull(continuar);
	}
	
	
	@Test
	public void testCarrinhoVazio() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.pontofrio.com.br");
		
		WebElement produto = driver.findElement(By.id("177974507"));
		produto.click();
		
		WebElement botao = driver.findElement(By.id("btnAdicionarCarrinho"));
		botao.click();
		
		WebElement continuar = driver.findElement(By.className("continue-button"));
		Assert.assertNull(continuar);
	}

}
