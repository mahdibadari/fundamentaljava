package junitlearning;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class Test1 {
	String message = "Robert";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		System.out.println("inside testPrintMessage()");
		assertEquals(message, msgUtil.printMessage());
	}
}
