package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertPractice {


		@Test
		public void demo() {
			
			boolean actualBoolResult = true;
			boolean expectedBoolResult = true;
			
			String actualStrResults = "qspider";
			String expectedStrResults = "qspider";
			
			
			
			SoftAssert soft = new SoftAssert();
			
			Assert.assertEquals(actualBoolResult, expectedBoolResult);
			System.out.println("Pass");
			
			Assert.assertEquals(actualStrResults, expectedStrResults);
			System.out.println("Pass");
			
			soft.assertAll();
			
			
				
		}
		@Test
		public void demo1() {
			
		   int actualIntResult = 10;
		   int expectedIntResult = 20;
		   
		   Assert.assertEquals(expectedIntResult, expectedIntResult);
		   System.out.println("pass");
		   
				
		System.out.println("updated in morning on 20th oct");
		System.out.println("update one more time in the morning from 20th oct");
		System.out.println("commit 1");
		

		}	

}
