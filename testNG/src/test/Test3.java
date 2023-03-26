package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void Test2() {
		System.out.println("TestNG case 1");
	}

	@Test(groups= {"smoke"})
	public void Test1() {
		System.out.println("TestNG case 2");
	}
	@Test
	public void BeforeClass()
	{
		System.out.println("Execute 1st even if the method having greater alphabetic order");
		}
	@ BeforeClass
	public void PreClass()
	{
		System.out.println("Execute at the beginning of Test3 class");
		}
	@ AfterClass
	public void PostClass()
	{
		System.out.println("Execute at the end of Test3 class");
		}
	@Test(dependsOnMethods= {"BeforeClass","Test1"})
	public void AfterClass()
	{
		System.out.println("Execute 2nd even if the method having lower alphabetic order");
		}
}
