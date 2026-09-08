package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	@BeforeClass
	public void befoclas()
	{
		System.out.println("before executing any method in the class");
	}
	
	@Parameters({"URL", "APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterclas()
	{
		System.out.println("After executing all the methods in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogincarLoan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobilesignincarLoan()
	{
		//Appium
		System.out.println("Mobile SIGNIN");
	}
	
	//@Test(timeOut=4000)
	@Test(dataProvider = "getData")
	public void MobilesignoutcarLoan(String username, String password)
	{
		//Appium
		System.out.println("Mobile SIGNOUT");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods={"WebloginCarLoan", "MobilesignoutcarLoan"})
	public void APIcarLoan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination  - username password - good credit history
		//2nd combination - username password - no credit history
		//3rd combination - username password - fraudulent credit history
		//columns in the row are nothing but values for that particular combination(row)
		Object[][] data = new Object[3][2];
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
