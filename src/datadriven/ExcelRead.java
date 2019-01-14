package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i = 0; i< sheets; i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		XSSFWorkbook ExcelWBook;
//		XSSFSheet ExcelWSheet;
//		XSSFCell Cell;
//		
//
//		//Location of the Excel file
//		String path = "C:\\Users\\Ismail\\eclipse-workspace\\Selenium-test\\src\\utilities\\ExcelRead.xlsx";
//		String sheetName = "Sheet1";
//		
//
//		
//		try {
//			FileInputStream Excelfile = new FileInputStream(path);
//			ExcelWBook = new XSSFWorkbook(Excelfile);
//			ExcelWSheet = ExcelWBook.getSheet(sheetName);
//			
//			Cell = ExcelWSheet.getRow(1).getCell(2);
//			String cellData = Cell.getStringCellValue();
//			System.out.println("cell Data " + cellData);
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
