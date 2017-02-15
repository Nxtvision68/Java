package Prime;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;


import javax.imageio.IIOException;

import java.io.FileReader;


public class Wire {
	File file = new File("d:\\Isro.txt");
	public void Write(){
		FileWriter Wr= null;
		
		try {
			Wr = new FileWriter(file);
			Wr.write("Hello vikram How are you?");
		}
		catch (Exception e){
			System.out.println("File not created");
			
		}
		finally {
			try {
				Wr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}


}
class Cable extends Wire {
	public void Reader() throws Exception {
		FileReader Re = null;
		super.Write();
		if(file.exists()){
	        	
			try {
				Re = new FileReader(file);
				int data = Re.read();
				while(data!= -1){
			System.out.println(data+":"+(char)data);
				data = Re.read();
				}
			
			}
			catch (Exception e){
				System.out.println("File not found");
			}
			
			finally {
				try {
				Re.close();
			}
				catch (Exception e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}

	class Loop extends Cable{
	  public void Pa(){
		 
		  String path = " ";
		  if (file.exists()){
			path = file.getAbsolutePath();
			  System.out.println("path is" + path );
		  } else {
			  System.out.println("path not found" );
		  }
		  
		  
	  }
	

		public static void main(String[] args) throws Exception  {
		         Loop obj = new Loop();
		           obj.Write();
		           obj.Reader();
		         
		           obj.Pa();
		           
		}
}