package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPractice
{	@BeforeSuite
	public void beforesuite()
	{
	System.out.println("in TestPractice of BeforeSuite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("in before test of testpractise");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("in before class of testpractise");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("in before method of testpractise");
	}
	@Test
	public void method1()
	{
		System.out.println("in Test Practice class method 1");
		Assert.assertEquals(false, true);
	}
	@Test
	public void method2()
	{
		System.out.println("In Test Practice class method 2");
		//Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("In Test Practice AfterMethod ");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("In Test Practice Afterclass ");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("In Test Practice AfterMethod ");
	}
	@AfterSuite
	public void Aftersuite()
	{
	System.out.println("in TestPractice of AfterSuite123");
	}
}
