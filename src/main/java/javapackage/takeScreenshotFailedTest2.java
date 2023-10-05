package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class takeScreenshotFailedTest2 {

	TakeSceenshot t1 = new TakeSceenshot();
	
	@Test
	public void loginFacebook() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		
		t1.driver = new ChromeDriver();
		t1.driver.get("https://www.facebook.com/");
		
		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shubhamkasle@gmail.com");
		t1.driver.findElement(By.xpath("//input[[@id='pass']")).sendKeys("Shubham@1511");
		t1.driver.findElement(By.xpath("//button[@name='login123']")).click();
	}
	
	@AfterMethod
	public void TakeScrrenshotfailure(ITestResult result) throws Exception {
		t1.captureScreenShot(result);
	}
}
