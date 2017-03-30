package Srealization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import IOStream.Employee;

public class ObjectWriter {



	public static void main(String args [])
	{
		
		try {
			Employee e= new Employee();
			FileOutputStream fop = new FileOutputStream("D://TestFile.ser");
			ObjectOutputStream os = new ObjectOutputStream(fop);
			  os.writeObject(e);  // only object calling 
			  System.out.println("sucess");
			fop.close();
			  os.close();
		
		} 
		
		
		catch (FileNotFoundException e1) {
		
			e1.printStackTrace();
		} catch (IOException e1) {
	
			e1.printStackTrace();
		}
	}
}
