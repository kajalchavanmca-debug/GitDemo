package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class test1class {

	@AfterTest
	public void lastExecution() {
		System.out.println("i will execute first");
		System.out.println("i will execute second");
		System.out.println("i will execute third");
	}
	@Test
	 public void demo() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Assert.assertTrue(false);
	 }
	@AfterTest
	public void afsuit()
	{
		System.out.println("I am no 1 from last");
		System.out.println("I am no 2 from last");
		System.out.println("I am no 3 from last");
		System.out.println("I am no 4 from last");
	}

}
