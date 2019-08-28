package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class GetNotificationinAndroid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		

		AndroidDriver<MobileElement> driver = null;

		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("browserName" ,"browser");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		cap.setCapability("appPackage", "com.makemytrip");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		cap.setCapability("appActivity", "com.mmt.travel.app.home.ui.SplashActivity");

		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(3000);
		//driver.findElement(By.id("com.makemytrip:id/skip_onboarding")).click();
		//
		
		driver.openNotifications();
		   Thread.sleep(2000);
		   List<MobileElement> allnotifications = driver.findElements(By.id("android:id/title"));
		   System.out.println("no of notifications " + allnotifications.size());
		 
		   for (MobileElement webElement : allnotifications) {
		       System.out.println(webElement.getText());
		       
		   }
		   System.out.println(driver.getPageSource());
		}
		

	
		
		
		

	

}
