package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class test4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("WebLoginHomePersonalLoan");
		System.out.println(uname);
	}

	@Test(groups= {"smoke"})
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("Mobile login loan");
	}
	
	@Test
	public void LoginAPIcarLoan()
	{
		//Rest APi Documentation
		System.out.println("API loan");
		
	}

}
