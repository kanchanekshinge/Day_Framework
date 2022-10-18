package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng {

	@BeforeClass
	public void login() {
		System.out.println("Login completd");
	}
	@AfterClass 
	public void logout() {
		System.out.println("Logout completed");
	}
	@Test(priority=2)
	public void addemp() {
		System.out.println("add new emp");
	}
	@Test(priority=1)
	public void delemp() {
		System.out.println("delete emp");
	}
	}

