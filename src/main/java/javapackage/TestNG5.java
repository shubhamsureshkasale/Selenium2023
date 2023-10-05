package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG5 {
	@Test(priority=1)
	public void signUp() {
		Assert.assertTrue(false);
		System.out.println("This is SignUP method");
	}

	@Test(dependsOnMethods = {"signUp"})
	public void login() {
		System.out.println("This is login method");
	}

	
}
