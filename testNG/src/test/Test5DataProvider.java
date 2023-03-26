package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test5DataProvider {

////	@ Parameters ({"URI"})
////	@Test
////	public void Method2(String uriname) {
////		System.out.println(" 1st Alphabetic order test module");
////		System.out.println(uriname);
//	}
	@BeforeMethod
	public void beforemethod () {

		System.out.println("Beforemethod execution");
	}
	@AfterMethod
	public void Aftermethod () {

		System.out.println("Aftermethod execution");
	}

	@Test(dataProvider="getdata")
	public void Printingdata(String Username, String Password) {
		System.out.println(Username);
		System.out.println(Password);
	}

	@DataProvider
	public Object [][] getdata () {
		// 1st combination - username password - good customer
		// 2nd combination - username password - average customer
		// 3rd combination - username password - bad customer
		Object [][] data = new Object [3][2];
		// 1st comb
		data [0][0] = "1stusername";
		data [0][1] = "1stpassword";
		// 1st comb
		data [1][0] = "2ndusername";
		data [1][1] = "2ndpassword";
		// 3rd comb
		data [2][0] = "3rdusername";
		data [2][1] = "3rdpassword";
		return data;
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

}
