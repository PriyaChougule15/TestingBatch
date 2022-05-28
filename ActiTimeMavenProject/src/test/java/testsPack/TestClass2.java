package testsPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Begore class method");
	}

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@Test
	public void testA()
	{
		System.out.println("test A");
	}
	@Test
	public void testB()
	{
		System.out.println("test B");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after method");
	}
}
