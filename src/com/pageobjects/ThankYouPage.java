package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ThankYouPage {

	public ThankYouPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private WebDriver driver;
	private By successMessageLocator = By.cssSelector("div[class='title']");
	private By orderNumberLocator = By.xpath("//ul[@class='details']/li[1]");
	private By continueButtonLocator = By.cssSelector("input[value='Continue']");
	
	public void clickOnContinuebutton()
	{
		driver.findElement(continueButtonLocator).click();
	}
	
	public void printOrderNumber()
	{
		WebElement orderNumberElement = driver.findElement(orderNumberLocator);
		String orderNumber = orderNumberElement.getText();
		System.out.println("Thankyou for shopping. This is your " + orderNumber);
	}

	public void validateSuccessMessage()
	{
		String reqSuccessMessage = "Your order has been successfully processed!";
		WebElement successMessageElement = driver.findElement(successMessageLocator);
		String actualSuccessMessage = successMessageElement.getText();
		Assert.assertEquals(actualSuccessMessage, reqSuccessMessage);
	}
	
}
