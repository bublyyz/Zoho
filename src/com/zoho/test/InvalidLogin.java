package com.zoho.test;

import org.testng.annotations.Test;

import com.zoho.page.LoginPage;

import generic.BaseTest;

//Automation script for Test Case 2 --> TestCaseName - InvalidLogin
public class InvalidLogin extends BaseTest {
	
	@Test(priority=2)
	public void testInvalidLogin(){
		
			
		//Enter invalid username
		LoginPage l=new LoginPage(driver);
		l.setUserName("abc");
		
		//Enter invalid password
		l.setPassword("xyz");
		
		//click on login
		l.clickLogin();
		
		//verify ErrMsg is displayed
		l.verifyErrMsgIsDisplayed();
	}

}
