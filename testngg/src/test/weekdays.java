package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class weekdays {
	
//	@BeforeMethod
//	public void launch() {
//		System.out.println("login");
//	}
//	
//	@AfterMethod
//	public void logout() {
//		System.out.println("log out");
//	}
	
	@BeforeClass
	public void launch() {
		System.out.println("login");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("log out");
	}
	
	
	
	@Test(priority = -1, dependsOnMethods = {"da","daam"})
	public void day() {
	//	System.out.println("launch browser");
		System.out.println("monday");
	}
	
	@Test
	public void da() {
	//	System.out.println("launch browser");
		System.out.println("tuesday");
	}
	
	@Test
	public void daam() {
	//	System.out.println("launch browser");
		System.out.println("wednesday");
	}
	
	@Test
	public void don() {
	//	System.out.println("launch browser");
		System.out.println("thursday");
	}
	
	@Test
	public void dayz() {
	//	System.out.println("launch browser");
		System.out.println("saturday");
	}
	
	

}
