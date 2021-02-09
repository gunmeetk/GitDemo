package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.goibibo.generic.BasePage;

public class CheckoutPage extends BasePage
{

	@FindBy(xpath = "//input[@data-testid='first-name']")
	private WebElement TXT_firstname;
	
	@FindBy(xpath = "//input[@data-testid='last-name']")
	private WebElement TXT_lastname;
	
	@FindBy(xpath = "//input[@data-testid='guest-details-email']")
	private WebElement TXT_email;
	
	@FindBy(xpath = "//input[@data-testid='guest-details-phone']")
	private WebElement TXT_phone;
	
	@FindBy(xpath = "//select[@class='PersonalProfile__ExpectedCheckinDropdown-sc-1r9ak8b-11 hAMeQo']")
	private WebElement DRP_checkintime;
	
	@FindBy(xpath = "//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-9 GuestDetailBlock__CustomButton-sc-6dnm3n-6 bzZSmm']")
	private WebElement BTN_proceed;
	
	@FindBy(name = "cardnumber")
	private WebElement TXT_cardno;
	
	@FindBy(xpath = "(//button[@class='button green large citipatBtn btn payNowBtn'])[1]")
	private WebElement BTN_pay;
	
	@FindBy(xpath = "//p[text()='Please Enter Valid Card Number']")
	private WebElement MSG_cardnumber;
	
	
	public CheckoutPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void Enterfirstname(String FirstName)
	{
		try
		{
			verifyElementPresent(TXT_firstname);
			TXT_firstname.sendKeys(FirstName);
			log.info("Able to enter first name");
		}
		catch(Exception e)
		{
			log.error("Unable to enter first name");
		}
	}
	
	public void Enteremail (String Email)
	{
		try
		{
			verifyElementPresent(TXT_email);
			TXT_email.sendKeys(Email);
			log.info("Able to enter email");
		}
		catch(Exception e)
		{
			log.error("Unable to enter email");
		}
		
	}
	
	public void Enterlastname (String LastName)
	{
		try
		{
			verifyElementPresent(TXT_lastname);
			TXT_lastname.sendKeys(LastName);
			log.info("Able to enter last name");
		}
		catch(Exception e)
		{
			log.error("Unable to enter last name");
		}
		
	}
	
	public void Enterphone (String Phone)
	{
		try
		{
			verifyElementPresent(TXT_phone);
			TXT_phone.sendKeys(Phone);
			log.info("Able to enter Phone No.");
		}
		catch(Exception e)
		{
			log.error("Unable to enter Phone No.");
		}
		
	}
	
	public void DropdownCheckinTime (String value)
	{
		try
		{
			new Select(DRP_checkintime).selectByValue(value);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void Clickproceed ()
	{
		try
		{
			verifyElementPresent(BTN_proceed);
			BTN_proceed.click();
			log.info("Able to proceed further");
		}
		catch(Exception e)
		{
			log.error("Unable to proceed further");
		}
		
	}
	
	public void Entercardno (String CardNo)
	{
		try
		{
			verifyElementPresent(TXT_cardno);
			TXT_cardno.click();
			TXT_cardno.sendKeys(CardNo);
			log.info("Able to enter Card No.");
		}
		catch(Exception e)
		{
			log.error("Unable to enter Card No.");
		}
		
	}
	
	public void Clickpay ()
	{
		try
		{
			verifyElementPresent(BTN_pay);
			BTN_pay.click();
			log.info("Able to enter Card No.");
		}
		catch(Exception e)
		{
			log.error("Unable to enter Card No.");
		}
		
	}
	
	
	public void ErrorMessage ()
	{
		try
		{
			
			verifyElementPresent(MSG_cardnumber);
			String errormessage = MSG_cardnumber.getText();
			Reporter.log(errormessage, true);
			log.info("Got the error message");
		}
		catch(Exception e)
		{
			log.error("Unable to get the error message");
		}
		
	}
}
