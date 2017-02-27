import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Input {

	private static Input reader = new Input();
	public String ecliqUrl;
	
	public Input()
	{
		readInputfile();
	}
	
	private void readInputfile() 
	
	{
	
		try {
			List<String> inputData = Files.readAllLines(Paths.get(System.getProperty("user.dir"),"Input.txt"));
			ecliqUrl = inputData.get(0);
			} 
		catch (IOException e) 
			{
			Log.error("File not present");
			}
	
	}
	
	public static Input Instance()
	{
		return reader;
	}
	
	
	
}
