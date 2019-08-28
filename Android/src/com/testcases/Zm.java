package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Zm {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AppiumDriver driver=null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName" ,"Android");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		//cap.setCapability("deviceName", "192.168.1.102:5555");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(15000);
		int scrHeight = driver.manage().window().getSize().getHeight(); //To get the mobile screen height
		int scrWidth = driver.manage().window().getSize().getWidth();//To get the mobile screen width
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction tAction0 = new TouchAction(driver);
		TouchAction tAction1 = new TouchAction(driver);
		System.out.println("scrWidth/2,scrHeight/2 ::::::  " + scrWidth/2 +","+ scrHeight/2);
		tAction0.press(scrWidth/4,scrHeight/4).waitAction().moveTo(scrWidth/4,60).release();//press finger center of the screen and then move y axis
		tAction1.press(scrWidth/4,(scrHeight/4)+40).waitAction().moveTo(scrWidth/4,80).release();// press thumb slightly down on the center of the screen and then move y axis
		Thread.sleep(10000);
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();// now perform both the actions simultaneously (tAction0 and tAction1)
		
	       System.out.println("done");
	}

}
