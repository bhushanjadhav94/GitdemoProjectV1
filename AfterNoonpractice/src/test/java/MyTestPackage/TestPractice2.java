package MyTestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPractice2
{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("in before test of testpractise2");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("in before class of testpractise2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("in before method of testpractise2");
	}
	@Test
	public void method1()
	{
		System.out.println("in Test Practice2 class method 1");
		//Assert.assertEquals(false, true);
	}
	@Test
	public void method2()
	{
		System.out.println("In Test Practice2 class method 2");
		//Assert.assertEquals(false, true);
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("in after method of testpractise2");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("in After class of testpractise2");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("in After test of testpractise2");
	}
}
