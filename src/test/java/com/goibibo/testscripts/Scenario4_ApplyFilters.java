package com.goibibo.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.goibibo.generic.BasePage;
import com.goibibo.generic.BaseTest;
import com.goibibo.pompages.HomePage;
import com.goibibo.pompages.HotelsListPage;
import com.goibibo.pompages.HotelsPage;

public class Scenario4_ApplyFilters extends BaseTest
{

		HomePage homepage = null;
		HotelsPage htpage = null;
		HotelsListPage hlpage = null;
		public Logger log = Logger.getLogger(BasePage.class);
		
		@Test
		
		public void TC_04_ApplyFilters()
		{
			homepage = new HomePage(driver);
			htpage = new HotelsPage(driver);
			hlpage = new HotelsListPage(driver);
			
			try
			{
				homepage.goToHotelsLink();
				htpage.enterLocation("Ooty");
				htpage.selectCheckInDate();
				htpage.selectCheckOutDate();
				htpage.selectnoofGuestsRooms();
				htpage.clickSearchHotels();
				hlpage.clickPayAtHotel();
				hlpage.clickCustomerRatings();
				hlpage.verifyCustomerRatings();
				hlpage.clickPriceRange();
				hlpage.verifyPriceRange();
				log.info("Able to apply filters on hotels list");
			}
			
			catch(Exception e)
			{
				log.error("Unable to apply filters on hotels list");
			}
		}
}
