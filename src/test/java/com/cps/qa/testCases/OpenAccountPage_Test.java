package com.cps.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cps.qa.base.TestBase;

import com.cps.qa.pages.LoginPage;
import com.cps.qa.pages.OpenAccountPage;
import com.cps.qa.pages.AccountPage;
import com.cps.qa.pages.AddCustomerPage;

public class OpenAccountPage_Test extends TestBase{
	LoginPage loginPage;
	OpenAccountPage openAccountPage;
	String OpenAccount_username = prop.getProperty("OpenAccount_username");
	
	
	
	
	public OpenAccountPage_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		openAccountPage = loginPage.ManagerLogin1();
		
		
		
	}
	
	@Test(priority=1)
	public void OpenAccount() throws InterruptedException{
		openAccountPage.OpenAccount_button.click();
		openAccountPage.AddCustomer(OpenAccount_username);
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
