package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG7 {
	@Test
	public void testcase() {
	int a=30;
	int b=20;
	
	String actualTitle="Facebook";
	String expectedTitle= "facebook";
	
//	Assert.assertTrue(a>b);
//	System.out.println("assertion verified");
	
	
	Assert.assertTrue(b>a,"assert expecte true");
	System.out.println("assertion verified");
	}

} 
