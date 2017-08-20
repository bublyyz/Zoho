package generic;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

//Base Class for all the POM classes
public class BasePage {	

	//Method Overloading- verifyTitle
	public void verifyTitle(WebDriver driver, String title){
		
		String actual=driver.getTitle();
		Assert.assertEquals(actual, title);
	}
	
	//Method Overloading- verifyTitle
	public void verifyTitle(WebDriver driver,long time, String title){
	
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
			
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("Title is matching",true);
		}
		catch(TimeoutException e){
		
			Reporter.log("Title is NOT matching",true);
			Assert.fail();
	    }
	}
	
	//Method Overloading- verifyElementPresent
	public void verifyElementPresent(WebElement element){
				
		Assert.assertTrue(element.isDisplayed());
	}
	
	//Method Overloading- verifyElementPresent
	public void verifyElementPresent(WebDriver driver,long time, WebElement element){
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
			
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is Present",true);
		}
		catch(TimeoutException e){
		
			Reporter.log("Element is NOT Present",true);
			Assert.fail();
	    }
	}
	
	public void sleep(int i){
		
		try {
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {			
			
		}
	}
}
	
			
		
		
		
		

	
	
	
	

