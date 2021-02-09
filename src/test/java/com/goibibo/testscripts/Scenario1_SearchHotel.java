package com.goibibo.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.goibibo.generic.BasePage;
import com.goibibo.generic.BaseTest;
import com.goibibo.pompages.HomePage;
import com.goibibo.pompages.HotelsPage;



public class Scenario1_SearchHotel extends BaseTest

{
	HomePage homepage = null;
	HotelsPage hotelspage = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
	
	@Test

	public void TC_01_SearchHotel()
	{
		homepage = new HomePage(driver);
		hotelspage = new HotelsPage(driver);
		
		try
		{
			homepage.goToHotelsLink();
			hotelspage.enterLocation("Goa");
			hotelspage.selectCheckInDate();
			hotelspage.selectCheckOutDate();
			hotelspage.selectnoofGuestsRooms();
			hotelspage.clickSearchHotels();
			hotelspage.getHotelName();
			log.info("Able to execute Scenario 1");
		}
		catch(Exception e)
		{
			log.error("Unable to execute Scenario 1");
		}
	}

}
