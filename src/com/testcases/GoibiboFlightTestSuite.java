package com.testcases;

import org.testng.annotations.Test;

import com.common.testing.Driver;
import com.pageobjects.GoibiboHomePage;

public class GoibiboFlightTestSuite extends Driver {
	
	@Test
	public void goibiboFlightBooking()
	{
		GoibiboHomePage goibiboHomePage = new GoibiboHomePage(driver);
		goibiboHomePage.clickOnFlights();
		goibiboHomePage.clickOnOneWayBooking();
		goibiboHomePage.enterFromAddress();
	}

}
