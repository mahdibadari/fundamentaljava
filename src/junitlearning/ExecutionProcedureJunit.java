package junitlearning;

import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

public class ExecutionProcedureJunit {
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in be4 class");
	}
	
	@Before
	public void before() {
		System.out.println("in before");
	}
	
	@After
	public void after() {
		System.out.println("in after");
	}
	
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}
	
	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}
	
}
