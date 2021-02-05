package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Finances;
import model.TaxReturn;

public class ReturnTests {

	TaxReturn taxReturn = new TaxReturn();
	Finances Bob = new Finances("Bob", 15000, 0);
	Finances Jen = new Finances("Jen" , 39000, 1);
	Finances Rick = new Finances("Rick", 93000, 2);
	Finances Joe = new Finances("Joe", 60000, 6);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		double amount = taxReturn.CalculateTaxReturn(Bob);
		assertEquals(0, amount, 0.0);
	}
	
	@Test
	public void test2() {
		double amount = taxReturn.CalculateTaxReturn(Jen);
		assertEquals(750, amount, 0.0);
	}
	
	@Test
	public void test3() {
		double amount = taxReturn.CalculateTaxReturn(Rick);
		assertEquals(1500, amount, 0.0);
	}
	
	@Test
	public void test4() {
		double amount = taxReturn.CalculateTaxReturn(Joe);
		assertEquals(4500, amount, 0.0);
	}
	
	@Test
	public void test5() {
		double amount1 = taxReturn.CalculateTaxReturn(Joe);
		double amount2 = taxReturn.CalculateTaxReturn(Bob);
		assertFalse(amount2 > amount1);
	}
	
	

}
