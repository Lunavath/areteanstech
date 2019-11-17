package com.areteans.objrepo;

import org.openqa.selenium.By;


public interface ObjectRepository {
	
	
	//home page - register locator

	public final static Locator link_register = new Locator(By.linkText("REGISTER"), "FirstName textbox");
	//register page locators

	public final static Locator txt_firstname = new Locator(By.xpath("//input[@name='firstName']"), "FirstName textbox");
	public final static Locator txt_lastname = new Locator(By.xpath("//input[@name='lastName']"), "LastName textbox");
	public final static Locator txt_phone = new Locator(By.xpath("//input[@name='phone']"), "Phone textbox");
	public final static Locator txt_email = new Locator(By.xpath("//input[@id='userName']"), "email textbox");
	public final static Locator txt_address = new Locator(By.xpath("//input[@name='address1']"), "address textbox");
	public final static Locator txt_city = new Locator(By.xpath("//input[@name='city']"), "city textbox");
	public final static Locator txt_state = new Locator(By.xpath("//input[@name='state']"), "state textbox");
	public final static Locator txt_postalcode = new Locator(By.xpath("//input[@name='postalCode']"), "postalcode textbox");
	public final static Locator drp_country = new Locator(By.xpath("//select[@name='country']"), "dropdown");
	public final static Locator txt_username = new Locator(By.xpath("//input[@name='email']"), "username textbox");
	public final static Locator txt_password = new Locator(By.xpath("//input[@name='password']"), "password textbox");
	public final static Locator txt_confirmPassword = new Locator(By.xpath("//input[@name='confirmPassword']"), "confirmPassword textbox");
	public final static Locator btn_bttnsubmit = new Locator(By.xpath("//input[@name='register']"), "button ");


	
	
	// login objects
	public final static Locator txt_userName = new Locator(By.name("txtUsername"),"User ID Textbox");
	public final static Locator txt_userName_New = new Locator("FirstName Textbox",By.id("asdsa"),By.xpath("asdsa"),By.name("txtUsername"));
	public final static Locator txt_passWord = new Locator(By.id("txtPassword"), "Password Textbox");
	public final static Locator btn_Login = new Locator(By.xpath("//input[@value='LOGIN']"), "Login Button");
	
	// Home Page Objects
	public final static Locator lnk_myInfo = new Locator(By.xpath("//a[@id='menu_pim_viewMyDetails']"), "myInfo link");
	public final static Locator lnk_Directory = new Locator(By.xpath("//a[@id='menu_directory_viewDirectory']"), "Directory link");

	// MyInfo Page Objects
	public final static Locator lnk_EmergectContacts = new Locator(By.linkText("Emergency Contacts"), "EmergectContacts link");
	
	// Emergency Contact Page Objects
	public final static Locator btn_EC_Add = new Locator(By.xpath("//input[@value='Add']"), "EmergectContacts Add Button");
	public final static Locator btn_EC_Save = new Locator(By.xpath("//input[@value='Save']"), "EmergectContacts Link");
	public final static Locator msg_EC_Save = new Locator(By.xpath("//*[contains(text(),'Successfully Saved')"), "EmergectContacts Save Button");
	public final static Locator btn_EC_AddAttachment = new Locator(By.id("btnAddAttachment"), "EmergectContacts Add attachment Button");
	
	// MyInfo Page Objects
	public final static Locator txt_Name = new Locator(By.id("emgcontacts_name"), "Name Textbox");
	public final static Locator txt_Relationship = new Locator(By.id("emgcontacts_relationship"), "Relationship Textbox");
	public final static Locator txt_HomeTelephone = new Locator(By.id("emgcontacts_homePhone"), "HomeTelephone Textbox");
	public final static Locator txt_Mobile = new Locator(By.id("emgcontacts_mobilePhone"), "Mobile Textbox");
	public final static Locator txt_WorkTelephone = new Locator(By.id("emgcontacts_workPhone"), "WorkTelephone Textbox");
	
	// logout objects
	public final static Locator lnk_Welcome = new Locator(By.id("welcome"), "Welcome link");
	public final static Locator lnk_Logout = new Locator(By.xpath("//a[text()='Logout']"), "Logout link");

}
