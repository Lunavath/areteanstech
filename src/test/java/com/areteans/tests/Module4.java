package com.areteans.tests;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.areteans.base.TestBase;
import com.areteans.pageobjects.LoginPage;

public class Module4 extends TestBase{
	
	@Test
	public void tc02_verify_Gettinglistofexisting_customers(List<Map<String, String>> testdata) {
		
		LoginPage loginPage=new LoginPage();
		loginPage.loginToApplication();
		
		boolean flag = loginPage.verifyHomePage();
		Assert.assertEquals(flag, true);	
		
		loginPage.logoutFromAppplication();

	}
}
