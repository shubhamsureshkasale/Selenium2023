package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void SignIn() throws Exception{
		String expected = "Sorry, we don't recognize this email.";
		System.out.println("Expected message is");
		System.out.println(expected);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fmail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAALr9M43mxIBQp53KAqTR02HF-odUM4K5HED9W6EZFdKvbH9SuTwtmteAWLQe1YhditFugzmNBclzizCfIIS5IYidIs4mUfuwcUs7yip3kRHb3QLexmsYg4lchpgi_AdMjb4-U7PsQci-vym4f3l2Cv0jbn-mzSoL9KtxqIareCBa");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(2000);
		
		String actual=driver.findElement(By.xpath("//p[@id='username-error']")).getText();
		System.out.println("actual message is");
		System.out.println(actual);
		Thread.sleep(2000);
		
		Assert.assertEquals(expected, actual);
		System.out.println("We validated the both strings");
	}

}
