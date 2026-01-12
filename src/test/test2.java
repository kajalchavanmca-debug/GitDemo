package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	@Test(groups= {"smoke"})
	public void plan()
	{
		// TODO Auto-generated method stub

		System.out.println("good");
	}
	@BeforeTest
	public void prerequiste()	
	{
		System.out.println("I will execute first");
	}

}
