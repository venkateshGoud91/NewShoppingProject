package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksCategoryPage {

	public BooksCategoryPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	private WebDriver driver;
	private By bookLocator = By.xpath("//div[@class='product-grid']/div[1]/div/div");
	
	
	public void clickOnBook()
	{
		driver.findElement(bookLocator).click();
	}
	
}
