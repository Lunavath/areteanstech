package com.areteans.tests;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.areteans.base.TestBase;
import com.areteans.pageobjects.LoginPage;

public class Module2 extends TestBase {
	
	@Test
	public void TC02_addEmergnecyDetails(List<Map<String, String>> testdata){
		
		LoginPage login=new LoginPage();
		login.loginToApplication();
		
		
	}

}
