package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener is an interface  which implements TestNG listeners
public class Listeners implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result)
	{
		//TODO Auto-generated method stub
		//System.out.println("I successfully executed Listeners Pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		//TODO Auto-generated method stub
		//screenshot code
		//response of API is failed
		System.out.println("I failed executing Listeners Pass code" + result.getName());
	}
}