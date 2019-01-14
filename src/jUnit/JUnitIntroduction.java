package jUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed before class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed after class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after test...");
	}

	@Test
	public void Test1() {
		System.out.println("Executed test1...");
	}
	
	@Test
	public void Test2() {
		System.out.println("Executed test2...");
	}

}
