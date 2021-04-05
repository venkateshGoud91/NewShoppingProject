package com.testcases;

import org.testng.annotations.Test;

import com.common.testing.Common;
import com.common.testing.Driver;
import com.pageobjects.BooksCategoryPage;
import com.pageobjects.ConformOrderPage;
import com.pageobjects.BillingAddressPage;
import com.pageobjects.HomePage;
import com.pageobjects.LoginPage;
import com.pageobjects.PaymentInformationPage;
import com.pageobjects.PaymentMethodPage;
import com.pageobjects.QuantityPage;
import com.pageobjects.ShippingAddressPage;
import com.pageobjects.ShippingMethod;
import com.pageobjects.ShoppingCartPage;
import com.pageobjects.ThankYouPage;

public class TestSuite extends Driver {
	
	@Test
	public void shoppingCart() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnLogin();
		loginPage.validateLoginMessage();
		loginPage.enterEmailId(Common.userName);
		loginPage.enterPassword(Common.password);
		loginPage.clickLoginButton();
		
		HomePage homePage = new HomePage(driver);
		homePage.validateAccountId();
		homePage.clickOnCart();
		
		try
		{
			homePage.clickRemoveCheckBox();
			homePage.clickOnUpdateCartButton();
		}
		catch(Exception e)
		{
			System.out.println("Not items found in cart");
		}
		finally
		{
			homePage.clickOnBooksCategory();
		}
		
		BooksCategoryPage booksCategoryPage = new BooksCategoryPage(driver);
		booksCategoryPage.clickOnBook();
		
		QuantityPage quantityPage = new QuantityPage(driver);
		quantityPage.getPriceOfBook();
		quantityPage.enterBooksQuantity();
		quantityPage.clickOnAddToCartButton();
		quantityPage.validateAddTOCartMessage();
		quantityPage.clickOnAddToCart();
		
		ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
		shoppingCartPage.clickCheckBox();
		shoppingCartPage.clickOnCheckout();
		
		BillingAddressPage billingAddressPage = new BillingAddressPage(driver);
		billingAddressPage.clickOnNewAddress();
		billingAddressPage.selectCountry();
		billingAddressPage.enterCityName("Mumbai");
		billingAddressPage.enterAddress1("Near Taj Hotel");
		billingAddressPage.enterPinCode("123568");
		billingAddressPage.enterPhoneNumber("7894561230");
		billingAddressPage.ClickOnContinueButton();
		
		ShippingAddressPage shippingAddressPage =new ShippingAddressPage(driver);
		shippingAddressPage.SelectShippingAddress();
		shippingAddressPage.clickOnContinue();
		
		ShippingMethod shippingMethod = new ShippingMethod(driver);
		shippingMethod.clickOnNexdatdayAir();
		shippingMethod.clickOnContinue();
		
		PaymentMethodPage paymentMethodPage = new PaymentMethodPage(driver);
		paymentMethodPage.clickOnContinue();
		
		PaymentInformationPage paymentInformationPage = new PaymentInformationPage(driver);
		paymentInformationPage.validateComment();
		paymentInformationPage.clickoncontinue();
		
		ConformOrderPage conformOrderPage = new ConformOrderPage(driver);
		conformOrderPage.clickOnConfoemButton();
		
		ThankYouPage thankYouPage = new ThankYouPage(driver);
		thankYouPage.validateSuccessMessage();
		thankYouPage.printOrderNumber();
		thankYouPage.clickOnContinuebutton();
		
		homePage.clickOnLogout();
	}

}
