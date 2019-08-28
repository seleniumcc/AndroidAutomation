package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class SelectOptionsOneByOne {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//WebDriver driver = null;
				AppiumDriver driver=null;
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
				String context =  ((AppiumDriver) driver).getContext();
				
				System.out.println(context);
				
				driver.findElement(By.id("com.makemytrip:id/skip_onboarding")).click();
				
				List<WebElement> alloptions= driver.findElements(By.id("com.makemytrip:id/ivIcon"));
				
				for(int i=0;i<alloptions.size();i++)
				{
					System.out.println("Options txt "+alloptions.get(i).getText());
					alloptions.get(i).click();
					driver.findElement(By.id("com.makemytrip:id/nav_icon")).click();
					
				}
				
				//driver.findElement(By.id("com.makemytrip:id/nav_icon")).click();
				
				//driver.findElement(By.id());
					System.out.println("Done");
	}

}
