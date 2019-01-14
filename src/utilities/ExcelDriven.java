package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class ExcelDriven {
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static FileInputStream fis;
	
	

	public static void main(String[] args) throws IOException{
		
		
		String value = getCelldata(2,1);
		System.out.println(value);
		
		value = setCelldata(2,2);
		System.out.println(value);
		
		
		
//		String value1 = getCelldata(2,3);
//		System.out.println(value1);
		
		
	}
	
	public static String getCelldata(int rownum, int col) throws IOException{
		
		fis = new FileInputStream("C:\\Users\\Ismail\\eclipse-workspace\\Selenium-test\\src\\utilities\\ExcelData.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(2);
	    cell = row.getCell(1);
	    String value = cell.getStringCellValue();
	    return value;
		
	}
	
public static String setCelldata(int rownum, int col) throws IOException{
		
		fis = new FileInputStream("C:\\Users\\Ismail\\eclipse-workspace\\Selenium-test\\src\\utilities\\ExcelData.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		row = sheet.getRow(1);
	    cell = row.getCell(1);
	    cell.setCellValue("Marvelous");
	    String value = cell.getStringCellValue();
	    return value;
	}

}
