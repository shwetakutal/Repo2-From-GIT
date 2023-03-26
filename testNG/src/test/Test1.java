package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Test1 {
  @ Parameters ({"URL"})
	@Test
	public void Test1 (String urlname) 
{
		System.out.println("TestNG case 1");
		System.out.println(urlname);
	}

	@Test(groups= {"smoke"})
	public void Test2() {
		System.out.println("TestNG case 2");
	}
	@ BeforeClass
	public void BeforeClass()
	{
		System.out.println("Execute at the beginning of Test1 class");
		}
	@ AfterClass
	public void AfterClass()
	{
		System.out.println("Execute at the end of Test1 class");
		}
	

}
