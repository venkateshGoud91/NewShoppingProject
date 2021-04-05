package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConformOrderPage {

	public ConformOrderPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private WebDriver driver;
	private By conformButtonLocator = By.cssSelector("input[onclick='ConfirmOrder.save()']");
	
	public void clickOnConfoemButton()
	{
		driver.findElement(conformButtonLocator).click();
	}

}
