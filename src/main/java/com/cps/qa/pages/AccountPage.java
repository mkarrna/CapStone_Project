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
	
	@FindBy(xpath="//button[@ng-click='deposit()']")
	WebElement Deposit_button;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Deposit_Submit;
	
	@FindBy(xpath="//button[normalize-space()='Withdrawl']")
	WebElement Withdraw_button;
	
	@FindBy(xpath="//div[2]/strong[1]")
	WebElement Account_number;
	
	@FindBy(xpath="//div[2]/strong[2]")
	WebElement Balance;

	@FindBy(xpath="//div[2]/strong[3]")
	WebElement Currency;
	
	@FindBy(xpath="//select[@id='accountSelect']")
	WebElement AccountNumberList;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement Deposit_Amount;
	
	
	
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
	
	public String GetBalance(){
		return Balance.getText();
	}
	
	
	public int acno()
	{
	 Select dropdown = new Select(AccountNumberList);
	  int itemCount = dropdown.getOptions().size();
	  return itemCount; 
	}
	
	public void SelectAccount(int index)
	{
		 Select dropdown = new Select(AccountNumberList);
		 dropdown.selectByIndex(index);
	}
	
	public AccountPage Deposit(int amount){
		Deposit_button.click();
		Deposit_Amount.sendKeys(String.valueOf(amount));
		Deposit_Submit.click();
		
	
		   	
		return new AccountPage();
	}
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
