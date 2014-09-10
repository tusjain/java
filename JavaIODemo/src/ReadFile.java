import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	
	private void ReadFileUsingBufferedReader(){
		BufferedReader br = null;
 		try {
 			String sCurrentLine;
 			br = new BufferedReader(new FileReader("pleaseReadMe.txt"));
 			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 		} catch (IOException ie) {
			System.out.println("IO Exception - File may not be present");
			ie.printStackTrace();
		}catch (Exception e) {
			System.out.println("I need to figure out the exception");
			e.printStackTrace();
		}finally {
			try {
				if (br != null)br.close();
			} catch (IOException ie) {
				System.out.println("This is bigger problem");
				ie.printStackTrace();
			}catch (Exception e) {
				System.out.println("Oh! my GOD!!!!");
				e.printStackTrace();
			}
		}
 	}
	
	private void ReadFileUsingTryWithResources(){
		try (BufferedReader br = new BufferedReader(new FileReader("pleaseReadMe.txt"))){
 			String sCurrentLine;
 			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
 		} catch (IOException ie) {
 			System.out.println("IO Exception - File may not be present");
 			ie.printStackTrace();
		}catch (Exception e) {
			System.out.println("I need to figure out the exception");
			e.printStackTrace();
		} 
 	}
	
	private void ReadFileOneMoreWay(){
		System.out.println("Reading File from Java code");
	    String fileName="pleaseReadMe.txt";
	    try{
	    	FileReader inputFile = new FileReader(fileName);
	       	BufferedReader bufferReader = new BufferedReader(inputFile);
	       	String line;
		    // Read file line by line and print on the console
		    while ((line = bufferReader.readLine()) != null)   {
		            System.out.println(line);
		    }
		    bufferReader.close();
		    }catch (IOException ie) {
	 			System.out.println("IO Exception - File may not be present");
	 			ie.printStackTrace();
		    }catch(Exception e){
		            System.out.println("I do not know the problem" + e.getMessage());                      
		    }
		
	}
	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		rf.ReadFileUsingBufferedReader();
		
	}
}