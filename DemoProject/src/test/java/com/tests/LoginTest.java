package com.tests;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.ModifyLoginPage;

public class LoginTest {
WebDriver driver = null;
DashboardPage dp = null;
ModifyLoginPage lp = null;

@BeforeSuite
public void setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("file:///D:/Selenium_setup/Offline%20Website/index.html");
	driver.manage().window().maximize();
	 lp = new ModifyLoginPage(driver);
}
@Test
	public void test01 () {
	dp = lp.validLogin();		//return dashboardpage initailize 
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
}
@Test
public void test02() {
	ArrayList<String> expectedCourses = new ArrayList<String>();
	expectedCourses.add("Selenium");
	expectedCourses.add("Java / J2EE");
	expectedCourses.add("Python");
	expectedCourses.add("Php"); 

//	ArrayList<String> actualCourses = dp.verifyCourses1();	//call the method verify courses 	
//	Assert.assertEquals(actualCourses, expectedCourses);
}
@Test
public void test03() {
	boolean flag = dp.verifyCourses1();
	Assert.assertTrue(flag);
	
	}
}
	

