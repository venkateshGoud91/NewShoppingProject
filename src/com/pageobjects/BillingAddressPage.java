package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BillingAddressPage {
	
	public BillingAddressPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	private WebDriver driver;
	private By newAddressLocator = By.id("billing-address-select");
	private By countryLocator = By.id("BillingNewAddress_CountryId");
	private By cityLocator = By.id("BillingNewAddress_City");
	private By address1Locator = By.id("BillingNewAddress_Address1");
	private By pinCodelocator = By.id("BillingNewAddress_ZipPostalCode");
	private By phoneNumberLocator = By.id("BillingNewAddress_PhoneNumber");
	private By continueButtonLicator = By.cssSelector("input[onclick='Billing.save()']");
	
	public void ClickOnContinueButton() 
	{
		driver.findElement(continueButtonLicator).click();
	}
	
	public void enterPhoneNumber(String phoneNumber)
	{
		WebElement phoneNumberElement =  driver.findElement(phoneNumberLocator);
		phoneNumberElement.clear();
		phoneNumberElement.sendKeys(phoneNumber);
	}
	
	public void enterPinCode(String pinCode)
	{
		WebElement pinCodeElement = driver.findElement(pinCodelocator);
		pinCodeElement.clear();
		pinCodeElement.sendKeys(pinCode);
	}
	
	public void enterAddress1(String address)
	{
		WebElement address1Element = driver.findElement(address1Locator);
		address1Element.clear();
		address1Element.sendKeys(address);
	}
	
	public void enterCityName(String city)
	{
		WebElement cityNameElement = driver.findElement(cityLocator) ;
		cityNameElement.clear();
		cityNameElement.sendKeys(city);
	}
	
	public void selectCountry()
	{
		Select country = new Select(driver.findElement(countryLocator));
		country.selectByValue("41");
	}
	
	public void clickOnNewAddress()
	{
		Select newAddress = new Select(driver.findElement(newAddressLocator));
		newAddress.selectByVisibleText("New Address");
	}
	
	
}
