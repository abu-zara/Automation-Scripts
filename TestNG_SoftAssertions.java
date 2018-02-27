package testClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import appCode.ClassToTest;

public class TestNG_SoftAssertions {
	
	
  @Test
  
  
  public void testSum() {
	  SoftAssert sa = new SoftAssert();
	  System.out.println("\nRunning Test -> testSum");
	  ClassToTest obj = new ClassToTest();
	  int result = obj.sumNumbers(1, 2);
//	  System.out.println("result = " + result);
	  sa.assertEquals(result, 2);
	  System.out.println("\nline after assert 1 ");
	  sa.assertEquals(result, 3);
	  System.out.println("\nline after assert 2");
	  sa.assertAll();
	  
  }
}
