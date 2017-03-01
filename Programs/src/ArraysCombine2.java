import java.util.HashSet;
import java.util.Hashtable;

public class ArraysCombine2 {

	/**
	 * Given 2 sorted arrays A and B that may have repeated elements. Form a new
	 * sorted array C that contains the elements of A and B. Condition: You are
	 * not allowed merge the 2 arrays and then sort.
	 */
	public static void main(String[] args) {
		int B[] = { -1, 1, 3, 5 };
		int A[] = { 2, 4,5,9,10,11,134,234 };
		int Clength = A.length + B.length;
		int C[] = new int[Clength];
		int i = 0;
		int j = 0;
		int current = 0;
		while (current < Clength) {
			if (i < A.length && j < B.length) {
				if (A[i] < B[j]) {
					C[current++] = A[i++];
				} else {
					C[current++] = B[j++];
				}
			} else if (i < A.length) {
				C[current++] = A[i++];
			} else if (j < B.length) {
				C[current++] = B[j++];
			}
		}
		
		System.out.println("Final value at position " );
	}
}
