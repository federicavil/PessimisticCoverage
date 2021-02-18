package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import logic.BankApi;

public class TestBankApi {
	
	@Test
	public void addCashBackAPIWithNullIban() {
		BankApi toTest = new BankApi();
		String iban = null;
		assertEquals(false, toTest.addCashBackAPI(iban));
	}
}
