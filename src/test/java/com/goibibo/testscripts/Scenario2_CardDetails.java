package com.goibibo.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.goibibo.generic.BasePage;
import com.goibibo.generic.BaseTest;
import com.goibibo.pompages.CheckoutPage;
import com.goibibo.pompages.HomePage;
import com.goibibo.pompages.HotelDetailsPage;
import com.goibibo.pompages.HotelsPage;

public class Scenario2_CardDetails extends BaseTest

{

	HomePage homepage = null;
	HotelsPage hotelspage = null;
	HotelDetailsPage hdpage = null;
	CheckoutPage ckpage = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
  @Test
	
	public void TC_02_CardDetails()
	{
		homepage = new HomePage(driver);
		hdpage = new HotelDetailsPage(driver);
		hotelspage = new HotelsPage(driver);
		ckpage = new CheckoutPage(driver);
		
		try
		{
			homepage.goToHotelsLink();
			hotelspage.enterLocation("Ooty");
			hotelspage.selectCheckInDate();
			hotelspage.selectCheckOutDate();
			hotelspage.selectnoofGuestsRooms();
			hotelspage.clickSearchHotels();
			hdpage.clickHotel();
			hdpage.HotelName();
			hdpage.selectRoom();
			ckpage.Enterfirstname("Test");
			ckpage.Enterlastname("User");
			ckpage.Enteremail("test55@mailinator.com");
			ckpage.Enterphone("1111155555");
			ckpage.DropdownCheckinTime("12 PM - 3 PM");
			ckpage.Clickproceed();
			ckpage.Entercardno("1111111111111");
			ckpage.Clickpay();
			ckpage.ErrorMessage();
			
		}
		catch(Exception e)
		{
			
		}
	
	
	}
  
}

