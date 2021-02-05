package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.TaxReturn;
import model.Finances;

public class TaxRateTests {
	
	TaxReturn taxReturn = new TaxReturn();
	Finances Bob = new Finances("Bob", 15000, 0);
	Finances Jen = new Finances("Jen" , 39000, 1);
	Finances Rick = new Finances("Rick", 93000, 2);

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		double amount = taxReturn.calculateTaxRate(Bob);
		assertEquals(0.10, amount, 0.0);
	}
	
	@Test
	public void test2() {
		double amount = taxReturn.calculateTaxRate(Jen);
		assertEquals(0.13, amount, 0.0);
	}
	
	@Test
	public void test3() {
		double amount = taxReturn.calculateTaxRate(Rick);
		assertEquals(0.22, amount, 0.0);
	}

}
