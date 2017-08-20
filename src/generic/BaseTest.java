package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

//Base Class for all the Test Classes

@Listeners(CustomListener.class)
public abstract class BaseTest implements IAutoConst{
	
	public WebDriver driver;
	
	static{
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}

	@BeforeMethod
	public void OpenApplication(){
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
	
	@AfterMethod
	public void CloseApplication(){
		
		driver.quit();
	}
	
	
}
