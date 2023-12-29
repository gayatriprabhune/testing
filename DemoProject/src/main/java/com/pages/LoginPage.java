package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver = null;			// Initializes webdriver
	public LoginPage(WebDriver driver) {		// make method
	this.driver = driver;						// to initializes
	}

	public WebElement getusername() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLoginbtn() {
		return driver.findElement(By.xpath("//button"));
	}
	
	public void loginToApplication(String username,String password) {
		getusername().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginbtn().click();
	}

	
}
