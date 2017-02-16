package Prime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




public class BufRe {
   public void BuffRead(){
	   File file = new File("d:\\OptimusPrime.txt");
	   FileReader reader = null;
	   BufferedReader bufferReader  = null;
	   if (file.exists()){
		   try {
			reader = new FileReader(file);
			bufferReader = new BufferedReader(reader);
		
				String line = bufferReader.readLine();
			    while (line!= null){
			    	System.out.println(line);
			    	line = bufferReader.readLine();
			    }
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();  
		 }
		   finally{
			   try {
				bufferReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   }
   }
	public static void main(String[] args) {
		BufRe obj = new BufRe();
		      obj.BuffRead();
		

	}

}
