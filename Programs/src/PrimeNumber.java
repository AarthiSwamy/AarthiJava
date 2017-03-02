
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	primeNumber(6);

	}
	
	public static int primeNumber(int n)
	{
		int primeNumber=0;
		System.out.println(n);
		
		if(n==0)
		return 0;
		
		else if(n==1)
		return 1;
		
		else if(n==2)
			return 2;
		
		return primeNumber(n%2);
	}

}
