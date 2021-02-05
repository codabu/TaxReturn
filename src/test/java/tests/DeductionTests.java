package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Finances;
import model.TaxReturn;

public class DeductionTests {

	TaxReturn taxReturn = new TaxReturn();
	Finances Bob = new Finances("Bob", 15000, 0);
	Finances Jen = new Finances("Jen" , 39000, 1);
	Finances Rick = new Finances("Rick", 93000, 2);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		double amount = taxReturn.calculateDeductions(Bob);
		assertEquals(0, amount, 0.0);
	}
	
	@Test
	public void test2() {
		double amount = taxReturn.calculateDeductions(Jen);
		assertEquals(1500, amount, 0.0);
	}
	
	@Test
	public void test3() {
		double amount = taxReturn.calculateDeductions(Rick);
		assertEquals(3000, amount, 0.0);
	}
	
	@Test
	public void test4() {
		double amount1 = taxReturn.calculateDeductions(Rick);
		double amount2 = taxReturn.calculateDeductions(Bob);
		assertFalse(amount1 == amount2);
	}

}
