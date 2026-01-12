package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {

	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/username"})

	@Test
	public void WebloginHomeLoan(String urlname,String key) {
		// selenium
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlname);
		System.out.println(key);
	}

	@BeforeMethod
	public void beforeevery() {
		System.out.println("i will execute before every test method in day 3class");
	}

	@AfterMethod
	public void afterevery() {
		System.out.println("i will execute after every test method in day 3class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("after executing any methods in the class");

	}

	@Test(groups = { "smoke" })
	public void MobileLogincarLoan() {
		// Appium
		System.out.println("Mobile login");
	}

	@BeforeTest
	public void Bfsuit() {
		System.out.println("I am no 1");
	}

	@Test(dataProvider="getData")
	public void MobilesigncarLoan(String username,String password) {
		// Appium
		System.out.println("Mobile Siging");
		System.out.println("username");
		System.out.println("password");		
	}

	@Test(dependsOnMethods = { "WebloginHomeLoan", "MobilesigncarLoan" })
	public void APIcarLoan() {
		// Rest APi Documentation
		System.out.println("API login car");
	}
	@DataProvider
	public Object[][] getData()
	{
		 //1st combination-username password -good credit history
		//2nd username password no credit history
		//3rd fraudelent credit histroy
		
		Object[][] data=new  Object[3][2];
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="firstpassowrd";
		
		//coumns in the rows are nothing but value for the particular combination(raw)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secoondpassowrd";
		
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassowrd";
		return data;
		
		
		
	}
}
