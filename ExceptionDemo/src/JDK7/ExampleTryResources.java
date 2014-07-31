package JDK7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleTryResources {
	
	public static void main(String[] args){
		
		//JDK 6 or below style
		/*
		BufferedReader reader = null;
		try {
			URL url = new URL("http://www.kashit.com/");
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = reader.readLine();
			SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
			Date date = format.parse(line);
		}catch (MalformedURLException exception) {
			// handle passing in the wrong type of URL.
		}catch (IOException exception) {
			// handle I/O problems.
		}catch (ParseException exception) {
			// handle date parse problems.
		}finally {
			if (reader != null) {
				try {
					reader.close();
				}catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		*/
		//JDK 7 style
		//Prior to Java SE 7, you can use a finally block to ensure that a resource is 
		//closed regardless of whether the try statement completes normally or abruptly. 
		
		//The new syntax allows you to declare resources that are part of the try block. 
		//What this means is that you define the resources ahead of time and the runtime
		//automatically closes those resources (if they are not already closed) after
		//the execution of the try block.
		try (
				//only classes/interfaces implementing/extending java.lang.AutoCloseable can be placed here
				BufferedReader	reader = new BufferedReader(new InputStreamReader(new URL("http://www.kashit.com").openStream()));
			)
			   {
			   	String line = reader.readLine();
			   	SimpleDateFormat format = new SimpleDateFormat("MM/DD/YY");
			   	Date date = format.parse(line);
			   }catch (ParseException | IOException exception) {
			   	// handle I/O problems.
			   }
	}

}