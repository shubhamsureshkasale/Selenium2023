package javapackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test
	public void h() {
		System.out.println("test case method H");
	}
	
	@Test
	public void z() {
		System.out.println("test case method Z");
	}
	
	@BeforeMethod   //It execute before each test case method
	public void f() {
		System.out.println("test case method F");
	}
	
	@AfterMethod   //It execute after  each test case method
	public void G() {
		System.out.println("test case method G");
	}
	
}
