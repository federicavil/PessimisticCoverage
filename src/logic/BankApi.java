package logic;

public class BankApi {
	
	private static final int IBAN_LENGHT = 5;
	
	public boolean addCashBackAPI(String iban) {
		Boolean addCorrect;
		if(iban.length() == IBAN_LENGHT) {
			System.out.println("Calling bank api to add the cashback");
			addCorrect = true;
		}
		else addCorrect = false;
		return addCorrect;
	}
}
