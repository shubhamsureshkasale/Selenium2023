package javapackage;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshot1 {

	WebDriver driver;
	
	public void captureScreeshot(ITestResult result) throws Exception {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			//1. create object of TakeScreenshot and type casting with driver
			
			TakesScreenshot ts=((TakesScreenshot)driver);
			
			//2.call method to capture the screenshot interms of file
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			
			//3.(./)I want to store image at project level
			
			//We need to set dependancy in pom.xml file- Selenium 2.53.1
			
			FileUtils.copyFile(src,new File("./screenshot/" +result.getName() +".png"));
		}
	}
}
