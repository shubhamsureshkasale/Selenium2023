package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshot2 {

	// create object of TakeScreenshot1

	TakeScreenshot1 t1 = new TakeScreenshot1();

	@Test(groups = {"facebook"})
	public void loginFacebook() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\QE18_Software\\chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		t1.driver = new ChromeDriver();

		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// enter email

		t1.driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Bali23@gmail.com");
		Thread.sleep(2000);

		// enter password

		t1.driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		Thread.sleep(2000);

		// click on Login using wrong xpath

		t1.driver.findElement(By.xpath("//button[@name='login123']")).click();
		Thread.sleep(2000);

	}

	@Test(groups = {"reddif"})
	public void alertWindow() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\QE18_Software\\chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		t1.driver = new ChromeDriver();

		t1.driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// launch web appliction
		Thread.sleep(2000);// controller stop execution till 2 sec

		// maximize Web Application or window
		t1.driver.manage().window().maximize();
		Thread.sleep(2000);// controller stop execution till 2 sec

		// click on Signin button without entering username or passowrd.

		t1.driver.findElement(By.xpath("//input[@name='proceeddddddddddd']")).click();
		Thread.sleep(2000);// controller stop execution till 2 sec

		// handling alert

		String ExpectedAlertText = "Please enter a valid user name";

		System.out.println(t1.driver.switchTo().alert().getText());
		Thread.sleep(2000);// controller stop execution till 2 sec

		if (t1.driver.switchTo().alert().getText().equalsIgnoreCase(ExpectedAlertText)) {
			Thread.sleep(2000);// controller stop execution till 2 sec

			System.out.println("Alert will get handled");

			t1.driver.switchTo().alert().accept();// accept the alert
		}

	}

	@Test(groups = {"facebook"})
	public void handleDropDown() throws Exception {
		// setting the property of chrome browser and passing the chromedriver path till
		// chromedriver.exe
		System.setProperty("webdriver.chrome.driver",
				"D:\\QE18_Software\\chrome_116\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		t1.driver = new ChromeDriver();

		t1.driver.get("https://www.facebook.com/");// launch web appliction
		Thread.sleep(2000);// controller stop execution till 2 sec

		// maximize Web Application or window
		t1.driver.manage().window().maximize();
		Thread.sleep(2000);// controller stop execution till 2 sec

		// click on Create new account button
		WebElement createNewAccount = t1.driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAccount.click();
		Thread.sleep(4000);// controller stop execution till 4 sec

		// 2 nd way handle dropdown.

		List<WebElement> dropdown = t1.driver.findElements(By.xpath("//select[@id='month']/optionnnnn"));// 12
		Thread.sleep(2000);// controller stop execution till 2 sec

		System.out.println(dropdown.size());// 12

		dropdown.get(6).click();// Jul
	}

	// It will execute after each test case method

	@AfterMethod
	public void TakeScreenshotOnFailure(ITestResult result) throws Exception {

		t1.captureScreeshot(result);
	}
}
