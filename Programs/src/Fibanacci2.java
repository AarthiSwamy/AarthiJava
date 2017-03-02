
public class Fibanacci2 {

	/**
	 * @param args
	 */
	
	 public static void main(String[] args) {
		 int num = 5;
		 int a = 0;
		 int b = 1;
		 int temp=0;
		 for(int i=0;i<num;i++)
		 {
			 temp = a;
			 a = a+b;
			 b = temp;
			 
		 }
		 
		 System.out.println("The number is "+a);
	    }
	 
	/* private static int fib(int n)
	 	{
		 	
		 if (n == 1)      
	     return 1;    
		if (n==2)
			 return 2;
		 else         
		 return fib(n-1);
	 	}*/

}
