package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 extends BaseClass{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		LoginPage loginPage=new LoginPage();
		WebElement txtUserName = loginPage.getTxtUserName();
		txtUserName.sendKeys("Lakshman123");
		WebElement txtPassword = loginPage.getTxtPassword();
		txtPassword.sendKeys("ela@1234");
		WebElement btnLogin = loginPage.getBtnLogin();
		btnLogin.click();
	
	}

}
