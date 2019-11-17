package com.areteans.tests;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.areteans.base.TestBase;
import com.areteans.library.reporting.ReporterClass;
import com.areteans.pageobjects.LoginPage;

public class Module3 extends TestBase{
	
	@Test
	public void tC01_verifyLoginFunctionality(List<Map<String, String>> testdata) {
		LoginPage loginPage=new LoginPage();
		loginPage.loginToApplication();
		
		boolean flag = loginPage.verifyHomePage();

		
		if(!flag)	{
			ReporterClass.writeToReport("fail", "application is dowon");
		}else {
			ReporterClass.writeToReport("pass", "application is dowon");
		}
		
		Assert.assertEquals(flag, true);		
		loginPage.logoutFromAppplication();
		
	}

}
