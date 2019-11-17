package com.areteans.pageobjects;

import java.util.Map;

import com.areteans.base.Appbase;

public class RegisterPage extends Appbase {
	
	public void registerUserInApplication(Map<String, String> testdata) {
		clickOn(link_register);
		setText(testdata.get("firstname"), txt_firstname);
		setText(testdata.get("lastname"), txt_lastname);
		setText(testdata.get("phone"), txt_phone);
		setText(testdata.get("email"), txt_email);
		setText(testdata.get("adress"), txt_address);
		setText(testdata.get("city"), txt_city);
		setText(testdata.get("state"), txt_state);
		setText(testdata.get("postalcode"), txt_postalcode);
		
		selectFromDropDown(testdata.get("coutry"), drp_country);
		
		setText(testdata.get("username"), txt_username);
		setText(testdata.get("password"), txt_password);
		setText(testdata.get("confpaswd"), txt_confirmPassword);
		clickOn(btn_bttnsubmit);
		
		
		
		
		
	}

}
