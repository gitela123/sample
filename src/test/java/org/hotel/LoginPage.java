package org.hotel;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	static BaseClass base;
	static LoginPage LoginPage;
	
	@BeforeClass
	private void logIn() {
	base=new BaseClass();
	WebDriver driver = base.driver;
	base.loadUrl("https://adactinhotelapp.com/");
	base.maximize();
	} 
	@Test
	public void tc0() {
		LoginPage = new LoginPage();
		LoginPage.getTextUserName();
	
	
	
	
	}
	














}
	@AfterClass
	
	












}
