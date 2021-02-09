package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.goibibo.generic.BasePage;

public class HotelDetailsPage extends BasePage
{

	@FindBy(xpath = "//div[@class='HotelCardstyles__HotelNameWrapperDiv-sc-1s80tyk-11 jkwhbV']")
	private WebElement LNK_Hotel;
	
	@FindBy(xpath = "(//div[@class='HotelInfostyles__CenterDiv-sc-1k29ep1-0 kOgSnd'])[2]")
	private WebElement TXT_hotelname;
	
	@FindBy(xpath = "(//button[@class='dwebCommonstyles__ButtonBase-sc-112ty3f-9 RoomFlavorstyles__ButtonWrapper-sc-1btnl3r-15 TIlHD'])[1]")
	private WebElement BTN_Room;
	
	@FindBy(linkText = "Room Options")
	private WebElement LNK_roomoptions;
	
	@FindBy(xpath = "(//p[@class = 'Roomstyles__RoomTypeTextStyled-sc-1ivl7fs-3 eaEtah'])[1]")
	private WebElement LST_roomtypes;
	
	@FindBy(xpath = "https://cdn1.goibibo.com/t_g_ing_v8/hotel-mayura-sudarshan-ooty-ooty-non-ac-double-room-1-167320903055-orijgp.jpg")
	private WebElement IMG_room;
	
	@FindBy(linkText = "Amenities")
	private WebElement LNK_amenities;
	
	@FindBy(linkText = "Guest Reviews")
	private WebElement LNK_reviews;
	
	@FindBy(xpath = "//div[@class='Layouts__Column-sc-1yzlivq-1 GuestReview__RatingsCountTextWrapper-sc-1twl4uk-3 hqsAUp']")
	private WebElement TXT_reviews;
	
	@FindBy(linkText = "Questions & Answers")
	private WebElement LNK_questions;
	
	@FindBy(id = "downshift-2-input")
	private WebElement TXT_questionsearchbox;
	
	@FindBy(xpath = "(//span[@class='QnaAutosuggeststyles__AnswerCount-sc-1k2sn2y-14 jIxCdi'])[1]")
	private WebElement TXT_answers;
	
	@FindBy(linkText = "Hotel Policies")
	private WebElement LNK_policies;
	
	@FindBy(xpath = "(//span[@class='Policystyles__PolicyTextStyled-sc-1vd94lq-7 ftfUCA'])[1]")
	private WebElement TXT_hotelpolicies;
	
	@FindBy(linkText = "Location")
	private WebElement LNK_location;
	
	@FindBy(xpath = "//ul[@class='LocationMapstyles__List-caml-9 AxHDR']")
	private WebElement LST_Nearbylocations;
	
	@FindBy(linkText = "Similar Hotels")
	private WebElement LNK_similar;
	
	public HotelDetailsPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickHotel()
	{
		try
		{
			verifyElementPresent(LNK_Hotel);
			LNK_Hotel.click();
			log.info("Click on hotel title");
		}
		catch(Exception e)
		{
			log.error("Unable to click on hotel title");
		}
	}
	
	public void HotelName()
	{
		try
		{
			SwitchWindow();
			verifyElementPresent(TXT_hotelname);
			String hotelname = TXT_hotelname.getText();
			System.out.println("Hotel Name :");
			Reporter.log(hotelname,true);
			log.info("Hotel name is displayed");
			
		}
		catch(Exception e)
		{
			log.error("Hotel Name not displayed");
		}
	}
	
	public void selectRoom()
	{
		try
		{
			verifyElementPresent(BTN_Room);
			BTN_Room.click();
			log.info("Able to select the room");
			
		}
		catch(Exception e)
		{
			log.error("Unable to select the room");
		}
	}
	
	public void clickRoomOptions()
	{
		try
		{
			//SwitchWindow();
			//ScrollDown();
			verifyElementPresent(LNK_roomoptions);
			LNK_roomoptions.click();
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void RoomsDisplayed()
	{
		try
		{
			verifyElementPresent(LST_roomtypes);
			String RoomTypes = LST_roomtypes.getText();
			Reporter.log(RoomTypes,true);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void clickLocations()
	{
		try
		{
			verifyElementPresent(LNK_location);
			LNK_location.click();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void LocationsDisplayed()
	{
		try
		{
			verifyElementPresent(LST_Nearbylocations);
			String NearbyLoactions = LST_Nearbylocations.getText();
			Reporter.log(NearbyLoactions,true);
			log.info("Location section is displayed");
		}
		catch(Exception e)
		{
			log.error("Location section is not displayed");
		}
	}
	
	public void clickGuestReviews()
	{
		try
		{
			verifyElementPresent(LNK_reviews);
			LNK_reviews.click();
			log.info("Able to click on Guest and Reviews");
			
		}
		catch(Exception e)
		{
			log.error("Unable to click on Guest and Reviews");
		}
	}
	
	public void GuestReviewsDisplayed()
	{
		try
		{
			verifyElementPresent(TXT_reviews);
			String GuestReviews = TXT_reviews.getText();
			Reporter.log(GuestReviews, true);
			log.info("Guest Reviews displayed");
		}
		catch(Exception e)
		{
			log.error("Guest Reviews not displayed");
		}
	}
	
	public void clickQuestionsAnswers()
	{
		try
		{
			verifyElementPresent(LNK_questions);
			LNK_questions.click();
			log.info("Able to click on Questions and Answers");
		}
		catch(Exception e)
		{
			log.error("Unable to click on Questions and Answers");
		}
	}
	
	public void QuestionAnswersDisplayed(String question)
	{
		try
		{
			verifyElementPresent(TXT_questionsearchbox);
			TXT_questionsearchbox.sendKeys(question);
			verifyElementPresent(TXT_answers);
			String NoOfAnswers = TXT_answers.getText();
			Reporter.log(NoOfAnswers, true);
			log.info("Questions and Answers displayed");
		}
		catch(Exception e)
		{
			log.error("Questions and Answers not displayed");
		}
	}
	
	public void clickHotelPolicies()
	{
		try
		{
			verifyElementPresent(LNK_policies);
			LNK_policies.click();
			log.info("Able to click on Hotel Policies");
		}
		catch(Exception e)
		{
			log.error("Unable to click on Hotel Policies");
		}
	}
	
	public void HotelPoliciesDisplayed()
	{
		try
		{
			verifyElementPresent(TXT_hotelpolicies);
			String hotelpolicies = TXT_hotelpolicies.getText();
			Reporter.log(hotelpolicies,true);
			log.info("Hotel Policies is displayed");
		}
		catch(Exception e)
		{
			log.error("Hotel Policies is not displayed");
		}
	}
	
	
}
