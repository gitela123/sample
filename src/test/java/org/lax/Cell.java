package org.lax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Cell {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\gokulraj\\eclipse-workspace\\Elavarasan\\Excel\\Book excel.xlsx");
		FileInputStream stream= new FileInputStream(file);
		Workbook workbook =new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i <sheet.getPhysicalNumberOfRows() ; i++) {
			Row row2 = sheet.getRow(i);
				
		for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
			org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(j);
			
		int type=cell2.getCellType();
		if (type==1) {
			String value = cell2.getStringCellValue();
			System.out.println(value);
		
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell2)) {
				Date date=cell2.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
				String name = dateFormat.format(date);
				System.out.println(name);
		}
			else {
				
			
			double d = cell2.getNumericCellValue();
			long l = (long) d;
			String of = String.valueOf(l);
			System.out.println(of);
		}
		}
	
	
	}

}}}
