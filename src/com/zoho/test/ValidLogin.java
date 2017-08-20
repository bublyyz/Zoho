package com.zoho.test;

import org.testng.annotations.Test;

import com.zoho.page.EnterTimeTrackPage;
import com.zoho.page.LoginPage;

import generic.BaseTest;

//Automation script for Test Case 1 --> TestCaseName - ValidLogin
public class ValidLogin extends BaseTest {
	
	@Test(priority=1)
	public void testValidLogin(){
		
		//Enter valid username
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		
		//Enter valid password
		l.setPassword("manager");
		
		//click on login
		l.clickLogin();
		
		//verify Home page is displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		
		e.verifyTitle(driver, 10, "actiTIME - Enter Time-Track");
	}
}
