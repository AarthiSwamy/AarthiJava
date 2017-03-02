public class Fibanacci {

	/**
	 * Find the nth number of the Fibanacci's series
	 */

	public static void main(String[] args) {
		System.out.println(Fibanacci(2));
	}

	public static int Fibanacci(int num) {
		System.out.println(num);

		int fibanacci;
		if (num == 0)
			return 0;
		else if (num == 1)
		return 1;
		return Fibanacci(num - 1) + Fibanacci(num - 2);

	}

}
