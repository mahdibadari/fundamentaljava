package junitlearning;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	EmpBusinessLogic empLogic = new EmpBusinessLogic();
	EmployeeDetails emp = new EmployeeDetails();
	
	@Test
	public void testCalculateAppraisal() {
		emp.setAge(20);
		emp.setMonthlySalart(8000);
		emp.setName("Rajesh");
		
		double appraisal = empLogic.calculateAppraisal(emp);
		assertEquals(500, appraisal, 0.0);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		emp.setAge(52);
		emp.setMonthlySalart(8000);
		emp.setName("Cyanide");
		
		double salary = empLogic.calculateYearlySalary(emp);
		assertEquals(96000, salary, 0.0);
	}
}
