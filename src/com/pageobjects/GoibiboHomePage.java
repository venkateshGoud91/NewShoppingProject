package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoibiboHomePage {
	public GoibiboHomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	private WebDriver driver;
	private By flightsLoactor = By.linkText("Flights");
	private By oneWayLocator = By.cssSelector("span[id='oneway']");
	private By fromLocator = By.id("gosuggest_inputSrc");
	
	public void enterFromAddress()
	{
		WebElement fromElement = driver.findElement(fromLocator);
		fromElement.sendKeys("Hyderabad");
		WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[contains(@class,'autoSuggestBoxList')]")));
        fromElement.sendKeys(Keys.ENTER);
       
		
	}
	
	public void clickOnOneWayBooking()
	{
		driver.findElement(oneWayLocator).click();
	}
	
	public void clickOnFlights()
	{
		driver.findElement(flightsLoactor).click();
	}
}
