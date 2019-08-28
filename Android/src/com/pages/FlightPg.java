package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightPg {
	
	By source = By.id("sec");
	By destination = By.className("dest:");
	
	

	public WebElement desttxtBox(WebDriver driver)
	
	{
		return driver.findElement(destination );
	}

	
	public WebElement sourcetxtBox(WebDriver driver)
	
	{
		return driver.findElement(source);
	}

}
