package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow1 {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//Thread.sleep(2000);
		System.out.println("Text message is ");
		String ExpectedAlertText = "Please enter a valid user name";
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("program executed succesfully");
		Thread.sleep(2000);
		driver.close();
	}

}
