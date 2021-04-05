package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private WebDriver driver;
	private By accountIdLocator = By.linkText("tester567@gmail.com");
	private By cartLocator = By.cssSelector("a[class='ico-cart']>span[class='cart-label']");
	private By removeLocator = By.cssSelector("input[name='removefromcart']");
	private By upadteCartLocator = By.cssSelector("input[name='updatecart']");
	private By bookCategoryLocator = By.xpath("//ul[@class='top-menu']/li[1]/a[1]");
	private By logoutLocator = By.linkText("Log out");
	
	public void clickOnLogout()
	{
		driver.findElement(logoutLocator).click();
	}

	public void clickOnUpdateCartButton()
	{
		driver.findElement(upadteCartLocator).click();
	}
	
	public void clickRemoveCheckBox()
	{
		driver.findElement(removeLocator).click();
	}
	
	public void clickOnBooksCategory() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(bookCategoryLocator).click();
	}
	
	public void clickOnCart()
	{
		driver.findElement(cartLocator).click();
	}
	
	public void validateAccountId()
	{
		String reqAccountId = "tester567@gmail.com";
		WebElement accountIdElement = driver.findElement(accountIdLocator);
		String actualAccountId = accountIdElement.getText();
		Assert.assertEquals(actualAccountId, reqAccountId);
	}
	
	
	
}
