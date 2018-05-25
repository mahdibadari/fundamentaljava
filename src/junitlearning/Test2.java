package junitlearning;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class Test2 {
	String message = "Robert";
	MessageUtil msgUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!"+"Robert";
		assertEquals(message, msgUtil.salutationMessage());
	}
}
