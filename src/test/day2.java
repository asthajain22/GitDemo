package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("good2");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
		System.out.println("I will execute first");
	}
}