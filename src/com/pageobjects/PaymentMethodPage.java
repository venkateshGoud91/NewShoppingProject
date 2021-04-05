package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentMethodPage {
	public PaymentMethodPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private WebDriver driver;
	private By continueLocator = By.cssSelector("input[onclick='PaymentMethod.save()']");
	
	public void clickOnContinue()
	{
		driver.findElement(continueLocator).click();
	}
}
