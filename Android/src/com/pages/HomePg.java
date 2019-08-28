package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePg {
	
	By flighttbtn = By.id("com.makemytrip:id/ivIcon");
	By homebtn = By.id("com.makemytrip:id/ivIcon");
	By holidaystbtn = By.id("com.makemytrip:id/rlIconLayout");
	
	public WebElement flightButton(WebDriver driver) {
		return driver.findElement(flighttbtn);
		
	}
	

}
