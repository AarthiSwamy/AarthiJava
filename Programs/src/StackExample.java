import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;

public class StackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("aarthi");
		stack.push("aarabhi");
		stack.push("bobo");
		stack.push("krishna");
		System.out.println("The value in stack is " + stack.pop());
		System.out.println("The value is " + landMark("seattle"));

	}

	public static String landMark(String inputString) {
		// String[] a = inputString.split("");
		char[] c = inputString.toCharArray();
		Arrays.sort(c);
		Hashtable ht = new Hashtable();
		String sortedInput = String.valueOf(c);
		System.out.println("wats it " + sortedInput);
		String landMark1 = "Seattle";
		String landMark2 = "Kirkland";
		String landMark3 = "aeelstt";
		String landMark4 = "Kenmore";
		String landMark5 = "Redmond";

		ht.put(1, landMark1);
		ht.put(2, landMark2);
		ht.put(3, landMark3);
		ht.put(4, landMark4);
		ht.put(5, landMark5);

		int i = 1;
		while (i < ht.size()) {
			if (sortedInput == ht.get(i)) {
				return (String) ht.get(i);
			}
			i++;
		}
		return null;
	}

}
