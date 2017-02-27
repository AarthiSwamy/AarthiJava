
public class BankAccount {
	
	private int accountNumber;
	private float balanceAmount;
	private String customerName;
	private String emailID;
	private int phoneNumber;
	private float transactionAmount;
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setbalanceAmount(float balanceAmount)
	{
		this.balanceAmount = balanceAmount;
	}
	public void settransactionAmount(float transactionAmount)
	{
		this.transactionAmount = transactionAmount;
	}
	public void customerName(String customerName)
	{
		this.customerName = customerName;
	}
	public void setemailID(String emailID)
	{
		this.emailID = emailID;
	}
	public void setphoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public float getbalanceAmount()
	{
		return balanceAmount;
	}
	public float gettransactionAmount()
	{
		return transactionAmount;
	}
	
	public String getcustomerName()
	{
		return customerName;
	}
	
	public void amountDeposit()
	{
		Log.logInfo("The old balance is "+balanceAmount);
		balanceAmount = balanceAmount+transactionAmount;
		Log.logInfo("The new balance after deposit is "+balanceAmount);
	
	}

	public void amountWithDrawal()
	{
		Log.logInfo("The old balance is "+balanceAmount);
		balanceAmount = balanceAmount-transactionAmount;
		if(balanceAmount>400)
			Log.logInfo("The new balance after withdrawal is "+balanceAmount);
		else
			Log.error("Withdrawal is not allowed");

	}

}
