package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPg {
	
	
	By skipBtn = By.id("com.makemytrip:id/skip_onboarding");
	By createBtn=By.id("com.makemytrip:id/tvSignup");
	
	
	
	public WebElement skipButton(WebDriver driver) {
		
		return driver.findElement(skipBtn);
		
	}
	
	public WebElement createAccountButton(WebDriver driver) {
		
		return driver.findElement(createBtn);
		
	}
	
	
	
	
	
	
	
	
	
	

}
