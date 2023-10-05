package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

		@Test(priority =1)
		public void balance() {
			Assert.assertTrue(3>10);
			System.out.println("This is balance method");
		}
		
		@Test(dependsOnMethods = {"balance"})
		public void payment() {
			System.out.println("This is payment method");
			
		}
}
