package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.generic.BasePage;

public class HomePage extends BasePage

{
	@FindBy(linkText = "Flights")
	private WebElement LNK_flights;
	
	@FindBy(xpath = "//i[@class='icon-hotels db blue ico28 lh1-2 padT2 padB3']")
	private WebElement LNK_hotels;
	
	@FindBy(xpath = "//i[@class='icon-gostays icon-gostays-cstm db blue padT5 padB5']")
	private WebElement LNK_gostaysHotel;
	
	@FindBy(linkText = "Bus")
	private WebElement LNK_bus;
	
	@FindBy(linkText = "IRCTC Trains")
	private WebElement LNK_trains;
	
	@FindBy(linkText = "Cabs")
	private WebElement LNK_cabs;
	
	@FindBy(linkText = "Visa")
	private WebElement LNK_visa;
	
	public HomePage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this); 
	}
	
	public void goToHotelsLink()
	{
		try
		{
			verifyElementPresent(LNK_hotels);
			LNK_hotels.click();
			log.info("Able to click on hotels link");
		}
		catch(Exception e)
		{
			log.error("Unable to click on hotels link");
		}
	}
	
}
