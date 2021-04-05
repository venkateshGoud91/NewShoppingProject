package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private WebDriver driver;
	private By loginLocator = By.partialLinkText("Log in");
	private By userEmail = By.id("Email");
	private By userPassword = By.id("Password");
	private By loginButton = By.cssSelector("input[value='Log in']");
	private By validateMessage = By.cssSelector("div[class='page-title']>h1");
	
	public void validateLoginMessage()
	{
		String reqMessage = "Welcome, Please Sign In!";
		WebElement messageElement = driver.findElement(validateMessage);
		String actualMessage = messageElement.getText();
		Assert.assertEquals(actualMessage, reqMessage);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void enterPassword(String password)
	{
		WebElement passwordElement = driver.findElement(userPassword);
		passwordElement.clear();
		passwordElement.sendKeys(password);
	}
	
	public void enterEmailId(String emailId)
	{
		WebElement emailIdElement = driver.findElement(userEmail);
		emailIdElement.clear();
		emailIdElement.sendKeys(emailId);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(loginLocator).click();
	}
}
