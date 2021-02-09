package com.goibibo.testscripts;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.goibibo.generic.BasePage;
import com.goibibo.generic.BaseTest;
import com.goibibo.pompages.HomePage;
import com.goibibo.pompages.HotelDetailsPage;
import com.goibibo.pompages.HotelsPage;

public class Scenario3_HotelDetails extends BaseTest
{

	HomePage homepage = null;
	HotelsPage hotelspage = null;
	HotelDetailsPage hdpage = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
	@Test
	
	public void TC_03_HotelDetails()
	{
		homepage = new HomePage(driver);
		hdpage = new HotelDetailsPage(driver);
		hotelspage = new HotelsPage(driver);
		
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
			hdpage.clickRoomOptions();
			hdpage.RoomsDisplayed();
			hdpage.clickLocations();
			hdpage.LocationsDisplayed();
			hdpage.clickGuestReviews();
			hdpage.GuestReviewsDisplayed();
			hdpage.clickQuestionsAnswers();
			hdpage.QuestionAnswersDisplayed("room");
			hdpage.clickHotelPolicies();
			hdpage.HotelPoliciesDisplayed();
			
		
		}
		catch(Exception e)
		{
			
		}
	}
	
}
