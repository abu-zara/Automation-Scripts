package extentReports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
 public static ExtentReports getInstance() {
	 ExtentReports extent;
	 String Path = "C:\\Users\\Ismail\\Downloads\\selenium-workspace\\ExtentReports\\Objectreport2.html";
	 extent = new ExtentReports(Path, false);
	 extent
	 .addSystemInfo("selenium version", "3.0");
 
	 
	 
	 return extent;
 }
}
