package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingMethod {
	
	public ShippingMethod(WebDriver driver)
	{
		this.driver= driver;
	}
	
	private WebDriver driver;
	private By nextdayShippingLocator = By.cssSelector("input[id='shippingoption_1']");
	private By continueLocator = By.cssSelector("input[onclick='ShippingMethod.save()']");
	
	public void clickOnContinue()
	{
		driver.findElement(continueLocator).click();
	}

	public void clickOnNexdatdayAir()
	{
		driver.findElement(nextdayShippingLocator).click();
	}
}
