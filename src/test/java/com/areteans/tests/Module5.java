package com.areteans.tests;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.areteans.base.TestBase;
import com.areteans.pageobjects.RegisterPage;

public class Module5 extends TestBase{

	@Test
	public void tc05_registerUser(List<Map<String, String>> testdata) {
		
		/*LoginPage_PF lpge=new LoginPage_PF();
		lpge.loginToApplication();*/
		
		RegisterPage rPage=new RegisterPage();
		for(int i=0;i<testdata.size();i++) {
			rPage.registerUserInApplication(testdata.get(i));
		}
		
	}
	
}
