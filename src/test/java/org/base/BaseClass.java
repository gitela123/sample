package org.base;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	public void loadUrl(String data) {
		driver.get(data);
}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void closeAllBrowser() {
		driver.quit();
	}
	public String attribute(WebElement element, String data) {
		String name = element.getAttribute("value");
		return name;
	}
	public void SelectOptionByText(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}
	public void SelectOptinByValue(WebElement element, String data) {
		new Select(element).selectByValue(data);
	}
	public void selectOptionByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}
	private String getTitle() {
	String title = driver.getTitle();
	return title;
	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void close() {
		driver.close();
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public String getHandle() {
		String handle = driver.getWindowHandle();
		return handle;
	}
	public Set<String> getHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;
	}
	public TargetLocator switchTo() {
		TargetLocator locator = driver.switchTo();
		return locator;
	}
	public Navigation navigate() {
		Navigation navigate = driver.navigate();
		return navigate;
	}
	public void forward() {
		driver.navigate().forward();
	}
	public void refresh() {
		driver.navigate().refresh();
	}
	public void back() {
		driver.navigate().back();
	}
	public void quit() {
		driver.quit();
	}
	public WebElement findElement() {
		WebElement element = driver.findElement(null);
		return element;
	}
	public List<WebElement> findElements() {
		List<WebElement> elements = driver.findElements(null);
		return elements;
	}
	public boolean isDisplayed(WebElement element) {
		boolean b = element.isDisplayed();
		return b;
	}
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	public void sendKeys(WebElement element) {
		element.sendKeys(null);
	}
	public Actions moveToElement(Actions actions) {
		Actions element = actions.moveToElement(null);
		return element;
	}
	
	public Actions contextClick(Actions actions) {
		Actions click = actions.contextClick();
		return click;
	}
	public Actions doubleClick(Actions actions) {
		Actions click = actions.doubleClick();
		return click;
	}
	public Actions dragandDrop(Actions actions) {
		Actions drop = actions.dragAndDrop(null, null);
		return drop;
	}
	public Actions keyUp(Actions actions) {
		Actions keyUp = actions.keyUp(null);
		return keyUp;
	}
	public Actions KeyDown(Actions actions) {
		Actions down = actions.keyDown(null);
		return down;
	}
	public void perform(Actions actions) {
		actions.perform();
	}
	public void accept(Alert alert) {
		alert.accept();
	}
	public void dismiss(Alert alert) {
		alert.dismiss();
	}
	public Row getrow(Sheet sheet) {
		Row row = sheet.getRow(0);
		return row;
	}
	public Cell getCell(Row row) {
		Cell cell = row.getCell(0);
		return cell;
	}
	public Object getScreenshotAs(TakesScreenshot screenshot) {
	Object screenshotAs = screenshot.getScreenshotAs(null);
	return screenshotAs;
	}
	public List<WebElement> SelectgetOptions(Select select) {
		List<WebElement> list = select.getOptions();
		return list;
	}
	public void deSelectAll(Select select) {
		select.deselectAll();
	}
	public boolean isMultiple(Select select) {
		boolean multiple = select.isMultiple();
		return multiple;
	}
	public WebElement getFirstSelectedOptions(Select select) {
		WebElement element = select.getFirstSelectedOption();
		return element;
	}
	public List<WebElement> getAllSelectedOptions(Select select) {
		List<WebElement> list = select.getAllSelectedOptions();
		return list;
	}
	public Actions sendKeys(Actions actions) {
		Actions keys = actions.sendKeys(null);
		return keys;
	}
	public void get() {
	driver.get(null);	
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public int getPhsicalNumberfRows(Sheet sheet) {
		int rows = sheet.getPhysicalNumberOfRows();
		return rows;
	}
	public int getPhsicalNumberfCells(Row row) {
		int cells = row.getPhysicalNumberOfCells();
		return cells;
	}
	public void setCellValue(Cell cell) {
		cell.setCellValue(0);
	}
	public void write(Workbook workbook) throws IOException {
		workbook.write(null);
	}
	public Sheet createSheet(Workbook workbook) {
		Sheet sheet = workbook.createSheet();
		return sheet;
	}
	public Row createRow(Sheet sheet) {
		Row row = sheet.createRow(0);
		return row;
	}
	public Cell createCell(Row row) {
		Cell cell = row.createCell(0);
		return cell;
	}
	public int getCellType(Cell cell) {
		int type = cell.getCellType();
		return type;
	}
	public Date getDateCellValue(Cell cell) {
		Date date = cell.getDateCellValue();
		return date;
	}
	
	
	
		public String getData(int rowNo, int cellNo) throws IOException {
		String data=null;
		File file = new File("C:\\Users\\gokulraj\\eclipse-workspace\\Elavarasan\\Excel\\Book2.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		int type = cell.getCellType();	
		if (type==1) {
			data = cell.getStringCellValue();
		}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MMM-yy");
				data = dateFormat.format(date);
			}else {
				double d = cell.getNumericCellValue();
				long l=(long) d;
				 data = String.valueOf(l);}
			}
		return data;
		}
	
		
		
		public String Adddata(int r, int c, String data) throws IOException {
		File file=new File("C:\\Users\\gokulraj\\eclipse-workspace\\Elavarasan\\Excel\\Book2.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(r);
		Cell cell = row.createCell(c);
		cell.setCellValue(data);
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		workbook.write(fileOutputStream);
		return data;

}
		public String  getattribute(WebElement element ) {
		String attribute = element.getAttribute("value");
		return attribute;
		}}







