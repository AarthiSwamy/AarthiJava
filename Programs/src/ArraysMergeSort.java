import java.util.Arrays;


public class ArraysMergeSort {

	/**
	 * Given 2 sorted arrays A and B that may have repeated elements.
	 * Form a new sorted array C that contains the elements of A and B.
	 */
	public static void main(String[] args) {

		int A[] = {-1,1,2,3,4,10,11,11};
		int B[] = {5,10,10,11,16};
		int Clength = A.length+B.length;
		int C[] = new int[Clength];
		
		int i = 0;
		while(i<A.length)
		{
			C[i]=A[i];
			//System.out.println(C[i]);
			i++;
		}
		int j=0;
		while(j<B.length)
		{
			C[A.length+j] = B[j];
			//System.out.println(C[j]);
			j++;
		}
		Arrays.sort(C);
		for(int m=0;m<Clength;m++)
		{
			System.out.println("Final value at position "+m+" is "+C[m]);
		}
		
	}

}