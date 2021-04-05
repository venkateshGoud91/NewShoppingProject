package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private WebDriver driver;
	private By agreeCheckBoxLocator = By.cssSelector("input[id='termsofservice']");
	private By checkoutLocator = By.cssSelector("button[id='checkout']");
	
	public void clickOnCheckout()
	{
		driver.findElement(checkoutLocator).click();
	}
	
	public void clickCheckBox()
	{
		driver.findElement(agreeCheckBoxLocator).click();
	}

}
