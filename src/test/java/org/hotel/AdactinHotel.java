
package org.hotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.impl.execchain.MainClientExec;
import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.ss.formula.IStabilityClassifier;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinHotel {
	public String getData(int rowNo, int cellNo) throws IOException {
	String data=null;
	File file = new File("C:\\Users\\gokulraj\\eclipse-workspace\\Elavarasan\\Excel\\Book2.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Sheet1");
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	int type = cell.getCellType();	
	if (type==0) {
		String value = cell.getStringCellValue();
	}
	if (type==0) {
		if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
			String format = dateFormat.format(date);
		}else {
			double d = cell.getNumericCellValue();
			long l=(long) d;
			 data = String.valueOf(l);}
		}
	return data;
	}
public static void main(String[] args) throws IOException {
	File file=new File("C:\\\\Users\\\\gokulraj\\\\eclipse-workspace\\\\Elavarasan\\\\Excel\\\\Book2.xlsx");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("AD");
	

	










}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


