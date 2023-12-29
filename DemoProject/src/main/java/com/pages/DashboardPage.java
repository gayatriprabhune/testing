package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver dpdriver = null;

    public DashboardPage(WebDriver driver) {
	this.dpdriver = driver;
	PageFactory.initElements(driver, this);			//to initialize driver on this page
}
    @FindBy(xpath="//h3") 							// gives list of webelement
    List<WebElement> courses;						//to access dashboard courses

    
public boolean verifyCourses1() {
	ArrayList<String> actualCourses = new ArrayList<String>();	//to store course list in to arraylist named by actual courses
	for(WebElement course : courses) {
		String text = course.getText();
		actualCourses.add(text);
	}
	ArrayList<String> expectedCourses = new ArrayList<String>();
	expectedCourses.add("Selenium");
	expectedCourses.add("Java / J2EE");
	expectedCourses.add("Python");
	expectedCourses.add("Php"); 
	if(actualCourses.equals(expectedCourses))
		return true;
	else
		return false;
	
	
}


}


