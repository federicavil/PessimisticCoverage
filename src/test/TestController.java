package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logic.Controller;

public class TestController {
	
	@Test
	public void testAddCashBack() {
		Controller toTest = new Controller();
		String iban = "ABCDE";
		assertEquals(true, toTest.addCashBack(iban));
	}
	
	@Test
	public void testAddCashBackWithNullIban() {
		Controller toTest = new Controller();
		String iban = null;
		assertEquals(false, toTest.addCashBack(iban));
	}
	
	@Test
	public void testAddCashBackWithIncorrectIban() {
		Controller toTest = new Controller();
		String iban = "AB";
		assertEquals(false, toTest.addCashBack(iban));
	}
}
