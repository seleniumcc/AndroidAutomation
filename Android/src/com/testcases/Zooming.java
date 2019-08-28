package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Zooming {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//AppiumDriver driver=null;
		AndroidDriver driver =null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName" ,"Android");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		//cap.setCapability("deviceName", "192.168.1.102:5555");
		cap.setCapability("browserName", "chrome");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		//cap.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		driver.get("http://vindeep.com");
		
		Thread.sleep(10000);
		/*TouchAction  touchAction = new TouchAction(driver);
	    MultiTouchAction  multiTouchAction = new MultiTouchAction(driver);
	  WebElement search=  driver.findElement(By.id("ContentPlaceHolder1_q"));
	   // WebElement search = (WebElement)   driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.google.android.apps.maps:id/search_omnibox_container\")"));
	     //touchAction .tap(search).perform();

	        int leftX = search.getLocation().getX();
	        int rightX = search.getSize().getWidth() + leftX;


	        int upperY = search.getLocation().getY();
	        int lowerY = search.getSize().getHeight() + upperY;
	        
	        System.out.println("Left x "+leftX);
	        System.out.println("right x "+rightX);
	        System.out.println("uppwr x "+upperY);
	        System.out.println("lower x "+lowerY);

	        TouchAction a1 = touchAction.press(search,490,700).waitAction().moveTo(search,600,900).release();
	       TouchAction a2 = touchAction.press(search,650,800).waitAction().moveTo(search,650,850).release();

	       multiTouchAction.add(a1).add(a2).perform();*/
		
			
		
		int scrHeight = driver.manage().window().getSize().getHeight(); //To get the mobile screen height
		int scrWidth = driver.manage().window().getSize().getWidth();//To get the mobile screen width
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction tAction0 = new TouchAction(driver);
		TouchAction tAction1 = new TouchAction(driver);
		System.out.println("scrWidth/2,scrHeight/2 ::::::  " + scrWidth/2 +","+ scrHeight/2);
		tAction0.press(scrWidth/4,scrHeight/4).waitAction().moveTo(scrWidth/4,60).release();//press finger center of the screen and then move y axis
		tAction1.press(scrWidth/4,(scrHeight/4)+40).waitAction().moveTo(scrWidth/4,80).release();// press thumb slightly down on the center of the screen and then move y axis
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();// now perform both the actions simultaneously (tAction0 and tAction1)
		Thread.sleep(10000);
	       System.out.println("done");
		
		
	}

}
