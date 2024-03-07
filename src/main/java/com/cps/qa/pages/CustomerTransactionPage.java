package com.cps.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cps.qa.base.TestBase;

public class CustomerTransactionPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//button[normalize-space()='Transactions']")
	WebElement Transaction_button;
	
	@FindBy(xpath="//input[@id='start']")
	WebElement Start;
	
	@FindBy(xpath="//input[@id='end']")
	WebElement end;
	
	@FindBy(xpath="//td[normalize-space()='Mar 5, 2024 3:05:29 PM']")
	WebElement Validation;
	
	
	
	//Initializing the Page Objects:
	public CustomerTransactionPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	
	
	
	
//	public void InValidWithdraw(int Amount) throws InterruptedException
//	{
//		int count = acno();
//		for(int i=0;i<count;i++)
//		{
//			 SelectAccount(i);
//			 int oldBal= Integer.valueOf(GetBalance());
//			 Withdraw(Amount);
//			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 int newBal = Integer.valueOf(GetBalance());
//			 int currentBal = Withdraw_CurrentBalance(Amount,oldBal) ;
//			 Assert.assertEquals(newBal,currentBal);
//			 
//			 
//		}
//	}
	
}
