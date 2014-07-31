import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteFile {
	String string="";
    String fileName ="fileUsinJava.txt";
	private void WriteFileOneMoreWay(){
		PrintWriter fileOut = null;
		try{
			FileWriter fw = new FileWriter (fileName);
	        BufferedWriter bw = new BufferedWriter (fw);
	        fileOut = new PrintWriter (bw); 
	        fileOut.println (string+"\n test of read and write !!"); 
	        
	        System.out.println("the file " + fileName + " is created!"); 
		    }catch (IOException ie) {
	 			System.out.println("IO Exception - Not able to write file");
	 			ie.printStackTrace();
		    }catch(Exception e){
		            System.out.println("I do not know the problem" + e.getMessage());                      
		    }finally{
		    	if(fileOut != null){
		    		fileOut.close();
		    	}
		    }
	}
	private void WriteBinaryFile(){
		FileOutputStream outputStream = null;
	     try {
            // Put some bytes in a buffer so we can
            // write them. Usually this would be
            // image data or something. Or it might
            // be unicode text.
            String bytes = "Hello theren";
            byte[] buffer = bytes.getBytes();
            outputStream = new FileOutputStream(fileName);
            // write() writes as many bytes from the buffer
            // as the length of the buffer. You can also
            // use write(buffer, offset, length)
            // if you want to write a specific number of
            // bytes, or only part of the buffer.
            outputStream.write(buffer);
            System.out.println("Wrote " + buffer.length +  " bytes");
        }catch(IOException ex) {
            System.out.println("Error writing file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }catch(Exception e){
            System.out.println("I do not know the problem" + e.getMessage());                      
        }finally{
	    	if(outputStream != null){
	    		try{
	    		outputStream.close();
	    		}catch(Exception e){
	    			System.out.println("This is too much");
	    			e.printStackTrace();	    			
	    		}
	    	}
	}
}
}