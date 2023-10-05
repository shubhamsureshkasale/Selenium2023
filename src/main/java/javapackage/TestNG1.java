package javapackage;

import org.testng.annotations.Test;

public class TestNG1 {
	//using TestNG we don't required main method @test itself consider as test case
   @Test
	public void a() {
		System.out.println("Test case method a");
	}
   
   @Test
 	public void z() {
 		System.out.println("Test case method z");
 	}

   @Test
 	public void b() {
 		System.out.println("Test case method b");
 	}

}
