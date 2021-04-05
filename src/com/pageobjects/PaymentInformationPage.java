package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PaymentInformationPage {
	public PaymentInformationPage(WebDriver driver)
	{
		this.driver=driver;
	}

	private WebDriver driver;
	private By commentLocator = By.xpath("//div[@class='info']/table/tbody/tr/td");
	private By continueLocator = By.cssSelector("input[onclick='PaymentInfo.save()']");
	
	public void clickoncontinue()
	{
		driver.findElement(continueLocator).click();
	}
	
	public void validateComment()
	{
		String reqComment = "You will pay by COD";
		WebElement commentElement = driver.findElement(commentLocator);
		String actualComment = commentElement.getText()	;
		Assert.assertEquals(actualComment, reqComment);
	}
}
