package junitlearning;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeChecker;
	
	@Before
	public void initialize() {
		primeChecker = new PrimeNumberChecker();
	}
	
	public PrimeTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] {
			{2, true},
			{3, true},
			{6, false},
			{19, true},
			{22, false},
			{23, true},
			{28, false},
		});
	}
	
	@Test
	public void primecheckTest() {
		System.out.println("Parameterized Number is : "+inputNumber);
		assertEquals(expectedResult, primeChecker.validate(inputNumber));
	}
}
