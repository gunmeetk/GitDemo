package com.goibibo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.goibibo.generic.BasePage;

public class HotelsListPage extends BasePage
{

	@FindBy (xpath = "//span[text()='Pay At Hotel']")
	private WebElement CHK_payathotel;
	
	@FindBy (xpath = "(//span[@class='Filtersstyles__AverageReviewText-bkjigy-7 jEUtnW'])[1]")
	private WebElement CHK_rating4;
	
	@FindBy (xpath = "//span[text() = '4+']")
	private WebElement TXT_rating4;
	
	@FindBy (xpath = "//span[text ()= 'Upto ₹2000']")
	private WebElement CHK_pricerange;
	
	@FindBy (xpath = "(//div[@class = 'Chip-o2aze2-0 jcfdkp'])[2]")
	private WebElement TXT_pricerange;
	
	public HotelsListPage (WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickPayAtHotel()
	{
		try
		{
			verifyElementPresent(CHK_payathotel);
			CHK_payathotel.click();
			log.info("Able to click on filter pay at hotel");
		}
		catch(Exception e)
		{
			log.error("Unable to click on filter pay at hotel");
		}
	}

	public void clickCustomerRatings()
	
	{
		try
		{
			verifyElementPresent(CHK_rating4);
			CHK_rating4.click();
			log.info("Able to click on filter rating 4+");
		}
		catch (Exception e)
		{
			log.error("Unable to click on filter rating 4+");
		}
	}
	
	public void verifyCustomerRatings()
	{
		try
		{
			verifyElementPresent(TXT_rating4);
			String Customerrating = TXT_rating4.getText();
			Reporter.log(Customerrating,true);
			log.info("As selected customer rating");
			
		}
		catch(Exception e)
		{
			log.error("Not selected customer rating");
		}
	}
	
	public void clickPriceRange()
	{
		try
		{
			verifyElementPresent(CHK_pricerange);
			CHK_pricerange.click();
			log.info("Able to click on price range upto 2000");
		}
		catch (Exception e)
		{
			log.error("Unable to click on price range upto 2000");
		}
	}
	
	public void verifyPriceRange()
	{
		try
		{
			verifyElementPresent(TXT_pricerange);
			String Pricerange = TXT_pricerange.getText();
			Reporter.log(Pricerange,true);
			log.info("As selected price range");
			
		}
		catch(Exception e)
		{
			log.error("Not selected price range");
		}
	}
	}




