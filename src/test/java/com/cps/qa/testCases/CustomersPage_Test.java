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
import com.cps.qa.pages.CustomersPage;

public class CustomersPage_Test extends TestBase{
	LoginPage loginPage;
	CustomersPage customersPage;
	String Customers_username = prop.getProperty("Customers_username");
	
	
	
	
	public CustomersPage_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		customersPage = loginPage.ManagerLogin2();
	}
	
	@Test(priority=1)
	public void DeleteCustomerEntry() throws InterruptedException{
		customersPage.DeleteEntry(Customers_username);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
