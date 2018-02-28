package listenersPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class CustomListener3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// when <suite> tag starts
		System.out.println("onStart: before suite starts " );
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// when suit tag completes
		System.out.println("onStart: after suite completes " );

		
	}

	

}
