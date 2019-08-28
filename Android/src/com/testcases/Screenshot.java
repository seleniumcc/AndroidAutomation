package com.testcases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Screenshot {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	
	{
		DateFormat dateFormat;
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
		
		driver.findElement(By.id("com.makemytrip:id/ivIcon")).click();
		
		//Click on economy option and validate options
		
		driver.findElement(By.id("com.makemytrip:id/classLayout")).click();
		
		WebElement optionsView = driver.findElement(By.className("android.widget.RelativeLayout"));
		
		List<WebElement> optionsViewList=driver.findElements(By.className("android.widget.TextView"));
		
		for(int i=0;i<optionsViewList.size();i++)
		{
			System.out.println("options "+i +" is "+optionsViewList.get(i).getText());
		}
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		  // Create folder under project with name "screenshots" provided to destDir.
		  
		  String destFile = dateFormat.format(new Date()) + ".png";

		 // now copy the  screenshot to desired location using copyFile //method
		try {
			//FileUtils.copyFile(src, new File("../Android/screenshots/options.png"));
			FileUtils.copyFile(src, new File("../Android/screenshots/"+destFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" Not taken");
		}
		
		System.out.println("Done");
	
	}

}
