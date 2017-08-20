package com.zoho.test;

import org.testng.annotations.Test;

import com.zoho.page.EnterTimeTrackPage;
import com.zoho.page.LoginPage;

import generic.BaseTest;

//Automation script for Test Case 3 --> TestCaseName - VerifyProductVersion
public class VerifyProductVersion extends BaseTest {
	
	@Test(priority=3)
	public void testProductVersion(){
		
		//Enter valid username
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		
		//Enter valid password
		l.setPassword("manager");
		
		//click on login
		l.clickLogin();
		
		//verify Home page is displayed
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		
		e.clickHelp();
		
		//click about ur actitime
		e.clickAboutActiTIME();
		
		//verify that version is actiTIME 2017.3
		e.verifyVersion("actiTIME 2017.3");
		
		//click close button
		e.clickCloseButton();
		
		//click logout
		e.clickLogout();
	}
	

}
