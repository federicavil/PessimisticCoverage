package logic;

public class Controller {
	
	public boolean addCashBack(String iban) {
		Boolean addCorrect;
		if(iban != null) {
			addCorrect =  new BankApi().addCashBackAPI(iban);
		}
		else {
			System.out.println("Iban not correct");
			addCorrect =  false;
		}
		return addCorrect;
	}
}
