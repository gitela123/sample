package org.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Adactin {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass base=new BaseClass();	
		WebDriver driver = base.getDriver();
		base.loadUrl("https://adactinhotelapp.com/");
		base.maximize();
		WebElement txtUserName = driver.findElement(By.id("username"));
		base.type(txtUserName, base.getData(1, 0));
		WebElement txtPassword = driver.findElement(By.id("password"));
		base.type(txtPassword, base.getData(1, 1));
		WebElement btnLogin = driver.findElement(By.name("login"));
		base.click(btnLogin);
		WebElement dDnLocation = driver.findElement(By.id("location"));
		base.SelectOptionByText(dDnLocation, base.getData(6, 0));
		WebElement dDnHotel = driver.findElement(By.id("hotels"));
		base.SelectOptionByText(dDnHotel, base.getData(6, 1));
		WebElement dDnRoomtype = driver.findElement(By.id("room_type"));
		base.SelectOptionByText(dDnRoomtype, base.getData(6, 2));
		WebElement dDnRomno = driver.findElement(By.id("room_nos"));
		base.SelectOptionByText(dDnRomno, base.getData(6, 3));
		WebElement dDnCheckin = driver.findElement(By.id("datepick_in"));
		base.type(dDnCheckin, base.getData(6, 4));
		WebElement dDnCheckout = driver.findElement(By.id("datepick_out"));
		base.type(dDnCheckout, base.getData(6, 5));
		WebElement dDnAdults = driver.findElement(By.id("adult_room"));
		base.SelectOptionByText(dDnAdults, base.getData(6, 6));
		WebElement dDnChidren = driver.findElement(By.id("child_room"));
		base.SelectOptionByText(dDnChidren, base.getData(6, 7));
		WebElement dDnSearch = driver.findElement(By.id("Submit"));
		base.click(dDnSearch);
		WebElement dDnRadio = driver.findElement(By.id("radiobutton_0"));
		base.click(dDnRadio);
		WebElement btnCnt= driver.findElement(By.id("continue"));
		base.click(btnCnt);
		WebElement txtFirst= driver.findElement(By.id("first_name"));
		base.type(txtFirst, base.getData(6, 8));
		WebElement txtLast= driver.findElement(By.id("last_name"));
		base.type(txtLast, base.getData(6, 9));
		
		WebElement txtAdd= driver.findElement(By.id("address"));
		base.type(txtAdd, base.getData(6, 10));
		WebElement txtCard= driver.findElement(By.id("cc_num"));
		base.type(txtCard, base.getData(6, 11));
		WebElement dDnCardType= driver.findElement(By.id("cc_type"));
		base.SelectOptionByText(dDnCardType, base.getData(6, 12));
		WebElement dDnExpiry= driver.findElement(By.id("cc_exp_month"));
		base.SelectOptionByText(dDnExpiry, base.getData(6, 13));
		WebElement dDnExpiryYear= driver.findElement(By.id("cc_exp_year"));
		base.SelectOptionByText(dDnExpiryYear, base.getData(6, 14));
		WebElement dDnCcv= driver.findElement(By.id("cc_cvv"));
		base.type(dDnCcv, base.getData(6, 15));
		WebElement btnBok= driver.findElement(By.id("book_now"));
		base.click(btnBok);
		Thread.sleep(6000);
		WebElement Orderid= driver.findElement(By.id("order_no"));
		String getattribute = base.getattribute(Orderid);
		base.Adddata(6, 16, getattribute);
		
	
	}
	
}
