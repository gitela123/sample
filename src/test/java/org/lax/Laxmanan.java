package org.lax;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Laxmanan {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\gokulraj\\eclipse-workspace\\Elavarasan\\Excel\\Book excel.xlsx");
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("country");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement dDnCountry = driver.findElement(By.id("countries"));
		Select select = new Select(dDnCountry);
		List<WebElement> list = select.getOptions();
		
		for (WebElement x : list) {
			String text = x.getText();
			System.out.println(text);
		}
		for (int i = 1; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
		}
		FileOutputStream outputStream=new FileOutputStream(file);
		workbook.write(outputStream);
	
		System.out.println("done");
	
	}
}
