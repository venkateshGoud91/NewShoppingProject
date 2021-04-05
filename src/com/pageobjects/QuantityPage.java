package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class QuantityPage {
	public QuantityPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private WebDriver driver;
	private By enterQuantityLocator = By.id("addtocart_13_EnteredQuantity");
	private By addTocartButtonLocator = By.id("add-to-cart-button-13");
	private By priceLocator = By.cssSelector("span[itemprop='price']");
	private By messageLocator = By.cssSelector("p[class='content']");
	private By cartLocator = By.linkText("Shopping cart");
	
	public void clickOnAddToCart()
	{
		driver.findElement(cartLocator)	.click();
	}
	
	public void validateAddTOCartMessage()
	{
		String reqMessage = "The product has been added to your shopping cart"; 
		WebElement messageElement = driver.findElement(messageLocator);
		String actualMessage= messageElement.getText();
		Assert.assertEquals(actualMessage, reqMessage);
	}
	
	public void getPriceOfBook()
	{
		WebElement priceElement = driver.findElement(priceLocator);
		String priceOfbook = priceElement.getText();
		System.out.println(priceOfbook);
	}
	
	public void enterBooksQuantity()
	{
		WebElement booksQuantityElement = driver.findElement(enterQuantityLocator);
		booksQuantityElement.clear();
		booksQuantityElement.sendKeys("2");
	}
	
	public void clickOnAddToCartButton()
	{
		driver.findElement(addTocartButtonLocator).click();
	}

}
