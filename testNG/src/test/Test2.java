package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	@Test(groups= {"sanity"})
	public void Test1() {
		System.out.println("2nd Alphabetic order test module");
	}
	@ Parameters ({"URI"})
	@Test
	public void Method2(String uriname) {
		System.out.println(" 1st Alphabetic order test module");
		System.out.println(uriname);
	}
	@ BeforeSuite
	public void Beforesuite()
	{
		System.out.println("Execute at very Beginning of suite");
		}
	@ AfterSuite
	public void Aftresuite()
	{
		System.out.println("Execute at very End of suite");
		}
@ BeforeTest
public void prerequiste()
{
	System.out.println("1st Execution");
	}

@AfterTest
public void End () {
	
System.out.println("Last execution");
}
@BeforeMethod
public void beforemethod () {
	
System.out.println("Beforemethod execution");
}
@AfterMethod
public void Aftermethod () {
	
System.out.println("Aftermethod execution");
}
}
