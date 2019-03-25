package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.TestBase;

public class Listners extends TestBase implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
	

	TakesScreenshot ts=((TakesScreenshot)driver);
	File src=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(src, new File("./ScreenShots_22_03_Passed/"+result.getName()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts =((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./ScreenShots_10_09_Failed/"+result.getName()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		TakesScreenshot ts =((TakesScreenshot)driver);
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./ScreenShotsSkipped/"+result.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
		TakesScreenshot ts=((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(src, new File("./ScreenshotFolder/"+result.getName()+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
