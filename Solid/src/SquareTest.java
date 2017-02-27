import junit.framework.Assert;
import junit.framework.TestCase;


public class SquareTest extends TestCase 

{
	
	public void testSquare() throws Exception 
	{
	
	Square square = new Square(5);
	Assert.assertEquals("No Match", 20, square.area());
	
	}

}





