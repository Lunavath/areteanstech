package com.areteans.base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.areteans.library.drivers.Config;
import com.areteans.library.drivers.Driver;
import com.areteans.library.utils.Utils;

public class TestBase{

	@BeforeTest
	public void beforeTest() {
		Driver.intialize();
	}

	@AfterTest
	public void afterTest() {
		Driver.quitBrowser();
	}

	@BeforeMethod
	public void beforeMethod() {
		Driver.getDriver().get(Config.getProperty("appUrl"));
	}

	@BeforeSuite
	public void beforeSuit() {
		Utils.setUpResultsFolder();
	}
	
}
