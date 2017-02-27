
public class VipCustomer {
	
	private String nameCustomer;
	private int creditLimit;
	private String emailAddress;
	
	public VipCustomer()
	{
		this("art@gallon.com",1000,"Tims");
	}
	
	
	public VipCustomer(String nameCustomer, int creditLimit, String emailAddress)
	{
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		this.nameCustomer = nameCustomer;
	}
	
	

}
