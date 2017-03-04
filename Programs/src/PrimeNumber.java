public class PrimeNumber {

	/**
	 * Find the nth prime number
	 */

	public static void main(String[] args) {
		System.out.println("Primenumber is " + primeNumber(6));
	}

	public static int primeNumber(int n) {
		System.out.println("incoming " + n);
		if (n == 1)
			return 2;

		if (n == 2)
			return 3;

		int i = 4;
		int counter = 2;

		while (counter<= n) {

			if (i % 2 != 0) 
			
			{
				return 0;
				
			}
				
				else if(i % 3 != 0) {
				counter++;
				if (counter == n);
				
			}
			}
			i++;

		return i;

	}
}
