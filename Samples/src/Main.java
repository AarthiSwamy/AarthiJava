
public class Main {
	public static void main(String[] args){
		
	
		String a = Input.Instance().ecliqUrl;
		BankAccount bankaccount = new BankAccount();
		bankaccount.setbalanceAmount(1000);
		bankaccount.settransactionAmount(240);
		bankaccount.amountDeposit();
		bankaccount.amountWithDrawal();
		VipCustomer test = new VipCustomer();
		
	}
}
