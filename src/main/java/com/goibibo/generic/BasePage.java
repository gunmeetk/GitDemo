package com.goibibo.generic;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class BasePage 
{

	WebDriver driver = null;
	WebDriverWait w = null;
	public Logger log = Logger.getLogger(BasePage.class);
	
	public BasePage (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyTitle(String expTitle)
	{
		try
		{
		w = new WebDriverWait(driver,30);
		String actTitle = null;
		w.until(ExpectedConditions.titleContains(expTitle));
		actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		log.info("Title Matches");
		}
		catch (Exception e)
		{
			log.error("Title do not match"+e);
		}
		
	}
	
	public void verifyElementPresent(WebElement ele)
	{
		try
		{
			w = new WebDriverWait(driver,30);
			w.until(ExpectedConditions.visibilityOf(ele));
			log.info("Eement is present");
		}
		catch(Exception e)
		{
			log.error("Elemnet is not present"+e);
		}
	}
	
	public void MouseHover(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			log.info("Element is Mouse Hovered");
			
		}
		catch(Exception e)
		{
			log.error("Element not selected"+e);
		}
	}
	
	public void HandleFrames(WebElement ele)
	{
		try
		{
			driver.switchTo().frame(ele);
			w.until(ExpectedConditions.visibilityOf(ele));
			
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void ScrollDown()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,450)", "");
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void SwitchWindow()
	{
		try
		{
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
		}
		}
		
        catch(Exception e)
        {
        	
        }
	}
	

		
}
