package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	public ShippingAddressPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	private WebDriver driver;
	private By shippingAddressLocator = By.id("shipping-address-select");
	private By continueButtonLocator = By.cssSelector("input[onclick='Shipping.save()']");
	
	
	public void clickOnContinue()
	{
		driver.findElement(continueButtonLocator).click();
	}
	
	public void SelectShippingAddress()
	{
		Select shippingAddress = new Select(driver.findElement(shippingAddressLocator));
		shippingAddress.selectByVisibleText("tester test, Near Taj Hotel, Mumbai 123568, India");
	}

}
