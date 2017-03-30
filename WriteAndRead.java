package ranga1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class WriteAndRead { 
	public static void main(String[] args) {
		File obj = new File("D:\\ranga3.txt");
		FileWriter obj1 = null;
		FileReader obj2 = null;
		BufferedReader obj3 = null;
		try {
			obj1 = new FileWriter(obj);
			obj.createNewFile();
			obj1.write("hello iam rangarao");
			obj1.close();
			if(obj.exists()){
				obj2 = new FileReader(obj);
				obj3 = new BufferedReader(obj2);
				String i = obj3.readLine();
				while(i!=null){
					System.out.print(i);
					i = obj3.readLine();
					}
				} 
			}catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				obj3.close();
				obj2.close();	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
