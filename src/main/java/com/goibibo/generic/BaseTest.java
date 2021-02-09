package com.goibibo.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public abstract class BaseTest implements AutoConst
{

	public static WebDriver driver=null;
	public WebDriverWait wait=null;
	
	@Parameters("browserType")
	@BeforeMethod
	
	public void LaunchApp(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VAL);
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VAL);
			driver = new FirefoxDriver();	
		}
		
		else
		{
			Reporter.log("Invalid Browser", true);
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,10);
		driver.get(URL);	
	}
	
	
	/*
	@AfterMethod
	
	public void CloseApp()
	{
		driver.quit();
	}
*/
}
