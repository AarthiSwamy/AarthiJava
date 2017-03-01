public class Fibanacci {

	/**
	 * Find the nth of the Fibanacci's series
	 */
	private int num;

	public int Fibanacci(int num) {
		// Input validations
	
		int n = num;
		if (num <= 1) {
			System.out.println(n);
			return n;
		} else {
			n = ((num - 1) + (num -2));
			System.out.println(n);
			return n;
		}

	}

}
