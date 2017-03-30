package ranga1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TestReader {
	public static void main(String[] args) {
		File obj =  new File("D:\\ranga.txt");
		FileReader obj1=null;
		if(obj.exists()){
		try {
			obj1 = new FileReader(obj);
			int data = obj1.read();
			while(data!=-1){
				System.out.println((char)data);
				data = obj1.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				obj1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	  }
	}

}
