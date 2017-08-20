package generic;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import java.awt.Dimension;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener,IAutoConst {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String testName=result.getName();
		
		try{
			
			Robot r=new Robot();
			
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRect=new Rectangle(d);
			BufferedImage img = r.createScreenCapture(screenRect);
			
			SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy_hh_mm_ss");
			String now = s.format(new Date());
			
			ImageIO.write(img, "png",new File(PHOTOPATH+testName+now+".png"));
			
		}
		catch(Exception e){
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
