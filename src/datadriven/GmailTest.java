//package datadriven;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class GmailTest {
//
//	XSSFWorkbook wb = null;
//	XSSFSheet sheet = null;
//	XSSFRow row = null;
//	XSSFCell cell = null;
//	WebDriver driver = null;
//
//	@Test(dataProvider = "getData")
//	public void doLogin(String username, String password) {
//
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\geckodriver-v0.19.1-win64/geckodriver.exe");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://gmail.com");
//		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys(username);
//		driver.findElement(By.id("next")).click();
//		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(password);
//		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys(Keys.ENTER);
//		driver.quit(); 
//	}
//
//	@DataProvider()
//	public Object[][] getData() throws IOException {
//		FileInputStream fis = new FileInputStream(
//				"C:\\Users\\Ismail\\eclipse-workspace\\Selenium-test\\src\\utilities\\ExcelRead.xlsx");
//
//		wb = new XSSFWorkbook(fis);
//		// read sheet inside the workbook by its name
//		sheet = wb.getSheet("Sheet1");
//		// find number of rows in excel file
//		System.out.println(" First Row Number/Index: " + sheet.getFirstRowNum() + " *** Last Row Number/Index  "
//				+ sheet.getLastRowNum());
//
//		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum() + 1;
//		int colCount = sheet.getRow(0).getLastCellNum();
//
//		System.out.println("Row Count is: " + rowCount + " *** Column count is: " + colCount);
//
//		Object data[][] = new Object[rowCount][colCount];
//
//		for (int rNum = 2; rNum <= rowCount; rNum++) {
//			for (int cNum = 0; cNum <= colCount; cNum++) {
//				System.out.println(getCellData("Sheet1", cNum, rNum) + " ");
//				data[rNum - 2][cNum] = getCellData("Sheet1", cNum, rNum);
//
//			}
//			System.out.println();
//		}
//		return data;
//	}
//
//	@SuppressWarnings({ "deprecation", "static-access" })
//	public String getCellData(String sheetName, int colNum, int rowNum) {
//		try {
//			if (rowNum <=0)
//				return "";
//			int index = wb.getSheetIndex(sheetName);
//			if (index == 1)
//				return "";
//			sheet = wb.getSheetAt(index);
//			row = sheet.getRow(rowNum - 1);
//			if(row == null)
//				return "";
//			cell = row.getCell(colNum);
//			if (cell == null)
//				return "";
////			
////			if(cell.getCellType() == Cell.CELL_TYPE_STRING)
////				return cell.getStringCellValue(); 
////			else if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC || cell.getCellType() == Cell.CELL_TYPE_FORMULA) {
////				
////				String cellText = String.valueOf(cell.getNumericCellValue());
////				return cellText;
////			}else if (cell.getCellType() == cell.CELL_TYPE_BLANK)
////				return "";
////			else
////				return String.valueOf(cell.getBooleanCellValue());
////			} catch (Exception e){
////				e.printStackTrace();
////				return "row " + rowNum + " or column " + colNum + " does not exist in xls";
////			}
////	}
//
//}