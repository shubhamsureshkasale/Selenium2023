package javapackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeSceenshot {

	WebDriver driver;
	
	public void captureScreenShot(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus()) {
			
			//create object of TakesScreenshot  and type casting with driver
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			//we need to set selenium dependency 2.53.1
			
			FileUtils.copyFile(src, new File("./scrrenshot/"+ result.getName() + ".png"));
					
		}
	}

}
