package Prime;



import java.io.*;

import org.omg.CORBA.ExceptionList;

public class TestReader {
	public static void main(String[] args) {
		File S = new File("d:\\Sampelly.txt");
		FileReader reader = null;
		if (S.exists()){
			try{
			reader = new FileReader(S);
			int data = reader.read();
			while (data!=-1){
				System.out.println(data);
			}
			}
			catch(Exception e){
				System.out.println("FileNotFound");
				
			}
		  catch(ExceptionList ex){
			  System.out.println();
			  
		  }
			finally{
				S.close();
			}
		}
	}
}
 
		