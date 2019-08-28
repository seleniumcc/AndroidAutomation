package com.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class RateMe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// com.rkayapps.financeindia/.ui.MainActivity

		
	
		
		AppiumDriver driver=null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName" ,"Android");
		cap.setCapability("deviceName", "0123456789ABCDEF");
		//cap.setCapability("deviceName", "192.168.1.102:5555");
		cap.setCapability("appPackage", "com.rkayapps.financeindia");
	//	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		// UIAutomator is supported above and equal lollipop or 5.0
		
		cap.setCapability("appActivity", "com.rkayapps.financeindia.ui.MainActivity");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		Thread.sleep(5000);
		String context =  ((AppiumDriver) driver).getContext();
		
		System.out.println(context);
Dimension dim = driver.manage().window().getSize();
		
		int startX= dim.getWidth()/2;
		int starty = (int)(dim.getHeight());
		int endy = (int)(dim.getHeight());
		System.out.println("Here how you get the dimestions ");
		System.out.println(startX +"  "+starty+"  "+endy);
		
		Thread.sleep(5000);
		TouchAction action = new TouchAction((PerformsTouchActions)driver);
		action.press(115, 650).waitAction().moveTo(450,10).release().perform();
		Thread.sleep(2000);
		TouchAction action1 = new TouchAction((PerformsTouchActions)driver);
		action1.press(115, 650).waitAction().moveTo(450,10).release().perform();
		Thread.sleep(2000);
		TouchAction action2 = new TouchAction((PerformsTouchActions)driver);
		action2.press(115, 650).waitAction().moveTo(450,10).release().perform();
		List<WebElement> allopt = driver.findElements(By.className("android.widget.LinearLayout"));
		
		for(int i=0;i<allopt.size();i++)
		{WebElement el=null;
			try {
			
				el = allopt.get(i).findElement(By.id("com.rkayapps.financeindia:id/text"));
			
			
			System.out.println(el.getText());
			}catch(Exception e)
			{
				
			}
			if(el.getText().equals(("Rate & Feedback")))
			{
				System.out.println("Found");
				allopt.get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(5000);
		System.out.println(context);
		System.out.println("Done");
		
	
	}
	
	

}
