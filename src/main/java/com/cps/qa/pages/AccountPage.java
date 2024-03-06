package com.cps.qa.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.cps.qa.base.TestBase;

public class AccountPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//span[@class='fontBig ng-binding']")
	WebElement Customer_Name;
	
	@FindBy(xpath="//button[@class='btn btn-lg tab btn-primary']")
	WebElement Deposit_button;
	
	@FindBy(xpath="//button[normalize-space()='Withdrawl']")
	WebElement Withdraw_button;
	
	
	//Initializing the Page Objects:
	public AccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	
	public String verifyCustomerName(){
		return Customer_Name.getText();
	}
	
	
	
	
	
//	public AddToCart login(String un, String pwd){
//	
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		loginBtn.click();
//		    
//		    	
//		return new AddToCart();
//	}
//	public HomePage login1(String un, String pwd){
//		
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		loginBtn.click();
//		    
//		    	
//		return new HomePage();
//	}
//	
}
