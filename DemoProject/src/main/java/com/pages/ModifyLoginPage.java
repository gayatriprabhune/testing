package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModifyLoginPage {
	WebDriver lpdriver = null;
	public ModifyLoginPage(WebDriver driver) {
	this.lpdriver = driver;
	PageFactory.initElements(driver, this);		//to initialize driver on this page and for webelement which is written by find by annotation
	}
	@FindBy(id="email")							// to modify the code driver.we use findby annotation
	WebElement username;

	@FindBy(id="password")							
	WebElement password;
	
	@FindBy(xpath="//button")							
	WebElement LoginBtn;
	
	public void loginToApplication(String uname ,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		LoginBtn.click();
		
	}
	
	public DashboardPage validLogin() {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		LoginBtn.click();
		return new DashboardPage(lpdriver);
		
		
		
	}

}
