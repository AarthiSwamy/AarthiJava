
public class Movers {
	
	private String feedBack;
	private String notebookEntry;
	private String customerAcceptance;
	private String decision;
	private int miles;
	
	public Movers()
	{
	//	this.feedBack = feedBack;
	//	this.notebookEntry = notebookEntry;
	//	this.customerAcceptance = customerAcceptance;
	//	this.decision = decision;
	//	this.miles = miles;
	}
	
	public int getmiles(int miles)
	{
		System.out.println("Movers.getmiles executed");
		return miles;
	}
	public void makeDecision()
	{
		if (miles<5)
			System.out.println("Accept the order");
		else
			System.out.println("Order declined");
	}
	public void makeNoteBookEntry()
	{
		System.out.println("Add name of the customer to notebook");
	}
	public void getfeedBack()
	{
		System.out.println("Send feedback email to customer");
	}
}
