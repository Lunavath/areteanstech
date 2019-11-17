package com.areteans.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.areteans.base.Appbase;
import com.areteans.library.drivers.Config;

public class LoginPage_PF extends Appbase{

	@FindBy(how=How.NAME, name="txtUsername")
	WebElement txt_UNAME;
	
	@FindBy(how=How.ID, id="txtPassword")
	WebElement txt_PWD;

	@FindBy(how=How.XPATH, xpath="//input[@value='LOGIN']")
	WebElement btn_LGN;
	
	
	public LoginPage_PF() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginToApplication() {
		//setText(Config.getProperty("usrID"), txt_userName);
		txt_UNAME.sendKeys(Config.getProperty("usrID"));
		//setText(Config.getProperty("password"), txt_passWord);
		txt_PWD.sendKeys(Config.getProperty("password"));
		//clickOn(btn_Login);
		btn_LGN.click();
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
