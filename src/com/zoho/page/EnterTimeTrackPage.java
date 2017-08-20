package com.zoho.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.BasePage;

public class EnterTimeTrackPage extends BasePage {
	
	//Declaration
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement version;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeButton;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	//Parameterized Constructor
	//Initialization
	public EnterTimeTrackPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization 
	//action to be performed on that element
	public void clickHelp(){
		sleep(2);
		help.click();
	}
	
	public void clickAboutActiTIME(){
		
		aboutActiTIME.click();
	}
	
	public void verifyVersion(String eVersion){
		
		String aVersion=version.getText();
		Assert.assertEquals(aVersion, eVersion);		
	}
	
	public void clickCloseButton(){
		
		sleep(1);
		closeButton.click();
	}
	
	public void clickLogout(){
		logout.click();
	}

}
