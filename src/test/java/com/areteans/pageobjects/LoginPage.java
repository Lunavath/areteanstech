package com.areteans.pageobjects;

import com.areteans.base.Appbase;
import com.areteans.library.drivers.Config;

public class LoginPage extends Appbase{

	public void loginToApplication() {
		setText(Config.getProperty("usrID"), txt_userName);
		setText(Config.getProperty("password"), txt_passWord);
		clickOn(btn_Login);
	}
	
	public boolean verifyHomePage() {
		boolean flag = displayedAndVisibleOnPage(lnk_Welcome);
		return flag;
	}
	
	public void logoutFromAppplication() {
		clickOn(lnk_Welcome);
		clickOn(lnk_Logout);
	}
	
}
