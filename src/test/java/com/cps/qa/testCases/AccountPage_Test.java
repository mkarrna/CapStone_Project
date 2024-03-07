package com.cps.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cps.qa.base.TestBase;

import com.cps.qa.pages.LoginPage;
import com.cps.qa.pages.AccountPage;

public class AccountPage_Test extends TestBase{
	LoginPage loginPage;
	AccountPage accountPage;
	String AccountexistUser = prop.getProperty("AccontExistUser");
	String AccountNot_existUser = prop.getProperty("AccontNot_ExistUser");
	int ValidAmount = Integer.valueOf(prop.getProperty("ValidAmount")) ;
	int InValidAmount = Integer.valueOf(prop.getProperty("InValidAmount")) ;
	
	
	
	
	public AccountPage_Test(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		accountPage = loginPage.CustomerLogin(AccountexistUser);
		
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "XYZ Bank");
	}
	
	@Test(priority=2)
	public void verifyBalance()
	{
		String bal = accountPage.GetBalance();
		System.out.println(bal);
		Assert.assertEquals(bal,"5096");
		
	}
	

	@Test(priority=3)
	public void Verify_Deposit_With_ValideAmmount()
	{
		accountPage.ValidDeposit("Deposit Successful",ValidAmount);
	}
	
	@Test(priority=4)
	public void Verify_Deposit_With_InValideAmmount()
	{
		accountPage.InValidDeposit(InValidAmount);
	}
	
//	@Test(priority=4)
//	public void Deposit()
//	{
//		int count = accountPage.acno();
//		for(int i=0;i<count;i++)
//		{
//			 accountPage.SelectAccount(i);
//			 int oldBal= Integer.valueOf(accountPage.GetBalance());
//			 accountPage.Deposit(Amount);
//	
//			 int newBal = Integer.valueOf(accountPage.GetBalance());
//			 int currentBal = oldBal + Amount ;
//			 Assert.assertEquals(currentBal, newBal);
//		}
//	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
