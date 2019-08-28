package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartAppiumAndTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	


		//AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		//service.start();
		//your test scripts logic...
		
		AndroidDriver<MobileElement> driver = null;

		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("browserName" ,"browser");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		cap.setCapability("appPackage", "com.makemytrip");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		cap.setCapability("appActivity", "com.makemytrip.main");

		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4724/wd/hub"),cap);
		Thread.sleep(3000);
		driver.findElement(By.id("com.makemytrip:id/skip_onboarding")).click();
		//
		
		//Swipe
		
		//service.stop();
		driver.quit();
		System.out.println("Done");

	}

}
