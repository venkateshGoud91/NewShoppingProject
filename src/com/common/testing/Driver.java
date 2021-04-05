package com.common.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Driver {
	
	public WebDriver driver;
	public String currDir = System.getProperty("user.dir");

	
//	@BeforeMethod
	public void launchBrowser1()
	{
		String driverPath = currDir + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(Common.url1);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println(currDir);
		String driverPath = currDir + "\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(Common.url);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
//	@AfterMethod
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
