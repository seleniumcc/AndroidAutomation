package com.testsuites;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.FlightPg;
import com.pages.HomePg;
import com.pages.LandingPg;

import io.appium.java_client.android.AndroidDriver;

public class LandingPage {
	
	WebDriver driver =null;
	
	@BeforeClass
	public void init() throws MalformedURLException, InterruptedException 
	{

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName" ,"Android");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		//cap.setCapability("deviceName", "192.168.1.102:5555");
		cap.setCapability("appPackage", "com.makemytrip");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		cap.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(13000);
	}
	
	
	
	
	
	
	@Test
	public void skipAndBookFlight()
	{
		LandingPg landingPage = new LandingPg();
		landingPage.skipButton(driver).click();
		Reporter.log("Click on skip button at landing page");
		HomePg homepage = new HomePg();
		homepage.flightButton(driver).click();
		FlightPg flightpage= new FlightPg();
		
		flightpage.sourcetxtBox(driver).sendKeys("Delhi");
		flightpage.desttxtBox(driver).sendKeys("mumbai");
	}
	@Test
	public void createAccount() 
	{
		LandingPg landingPage = new LandingPg();
		landingPage.createAccountButton(driver).click();
		
	}
	
	
	

}
