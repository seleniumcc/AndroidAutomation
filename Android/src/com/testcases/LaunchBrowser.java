package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<MobileElement> driver = null;

		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("browserName" ,"browser");
		cap.setCapability("deviceName", "emulator:5554");
		  cap.setCapability("appPackage", "com.android.calculator2");

		  cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//xdriver.get("http://vindeep.com");
	
	}

}
