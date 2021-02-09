package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.goibibo.generic.BasePage;

public class HotelsPage extends BasePage
{

	
	@FindBy(id = "downshift-1-input")
	private WebElement TXT_where;
	
	@FindBy(xpath = "(//span[@class='HomePageAutosuggeststyles__SearchListItemLocationName-sc-1v6s32j-5 dqxIKI'])[1]")
	private WebElement LNK_Goa;
	
	@FindBy(xpath = "(//div[@data-testid='calendarRightArrowBtn']")
	private WebElement LNK_rightarrow;
	
	@FindBy(xpath = "//div[@data-testid='openCheckinCalendar']")
	private WebElement LNK_checkin;
	
	@FindBy(xpath = "//span[(text()='7')]")
	private WebElement LNK_checkindate;
	
	@FindBy(xpath = "(//div[@class='SearchBlockUIstyles__CheckInDateWrapDiv-fity7j-13 jKVcTv'])[2]")
	private WebElement LNK_checkout;
	
	@FindBy(xpath = "//span[(text()='10')]")
	private WebElement LNK_checkoutdate;
	
	@FindBy(xpath = "//input[@class='SearchBlockUIstyles__CitySearchInput-fity7j-11 czavmR']")
	private WebElement TXT_rooms;
	
	@FindBy(xpath = "(//span[(text()='-')])[2]")
	private WebElement LNK_noofadults;
	
	@FindBy(xpath = "//button[(text()='Done')]")
	private WebElement BTN_done;
	
	@FindBy(xpath = "//button[(text()='Search Hotels')]")
	private WebElement BTN_searchHotels;
	
	@FindBy(xpath = "//iframe[@id='_hjRemoteVarsFrame']")
	private WebElement FRM_firsthotel;
	
	@FindBy(xpath = "(//div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-11 jkwhbV'])[1]")
	private WebElement TXT_firsthotel;
	
	public HotelsPage(WebDriver driver)
	{
		super (driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterLocation(String LocationName)
	{
		try
		{
			verifyElementPresent(TXT_where);
			TXT_where.sendKeys(LocationName);
			verifyElementPresent(LNK_Goa);
			LNK_Goa.click();
			log.info("Able to enter the location");
		}
		catch(Exception e)
		{
			log.error("Unable to enter the location");
		}
	}
	
	public void selectCheckInDate()
	{
		try
		{
			verifyElementPresent(LNK_checkin);
			LNK_checkin.click();
			verifyElementPresent(LNK_rightarrow);
			LNK_rightarrow.click();
			verifyElementPresent(LNK_checkindate);
			LNK_checkindate.click();
			log.info("Check In date selected");
		}
		catch(Exception e)
		{
			log.error("Check in date not selected");
		}
	}
	
	public void selectCheckOutDate()
	{
		try
		{
			verifyElementPresent(LNK_checkoutdate);
			LNK_checkoutdate.click();
			log.info("Check Out date selected");
		}
		catch(Exception e)
		{
			log.error("Check Out date not selected");
		}
	}
	
	public void selectnoofGuestsRooms()
	{
		try
		{
			verifyElementPresent(TXT_rooms);
			TXT_rooms.click();
			verifyElementPresent(LNK_noofadults);
			LNK_noofadults.click();
			verifyElementPresent(BTN_done);
			BTN_done.click();
			log.info("Able to select no of adults");
		}
		catch(Exception e)
		{
			log.error("Unable to select no of adults");
		}
	}
	
	public void clickSearchHotels()
	{
		try
		{
			verifyElementPresent(BTN_searchHotels);
			BTN_searchHotels.click();
			log.info("Able to search hotels");
		}
		catch(Exception e)
		{
			log.error("Unable to search hotels");
		}
	}
	
	public void getFirstFrame()
	{
		try
		{
			
			HandleFrames(FRM_firsthotel);
			log.info("Able to print hotel name");
		}
		catch(Exception e)
		{
			log.error("Not able to print hotel name");
		}
		
	}
	public void getHotelName()
	{
		try
		{
			verifyElementPresent(TXT_firsthotel);
			String Hotelname = TXT_firsthotel.getText();
			Reporter.log(Hotelname, true);
			log.info("Able to print hotel name");
			
		}
		catch(Exception e)
		{
			log.error("Not able to print hotel name");
		}
	}
	
}
