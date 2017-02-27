import junit.framework.Assert;
import junit.framework.TestCase;


public class CircleTest extends TestCase {

	public void testCircle() throws Exception {
		Circle circle = new Circle(4);
		Assert.assertEquals("Area mismatch", 12, circle.area());	
	}
	
}
