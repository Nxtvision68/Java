package ranga1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class TestWriter {
	 FileWriter obj1;
	public static void main(String[] args) {
		File obj = new File("D:\\ranga.txt");
		FileWriter obj1 = null;
		if(!obj.exists()){
		try {
			obj.createNewFile();
			obj1 = new FileWriter(obj);
			obj1.write("hiii rangarao");
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
	