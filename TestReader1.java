package ranga1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TestReader1 {
	public static void main(String[] args) {
		File obj = new File("D:\\ranga.txt");
		FileReader obj1 = null;
		BufferedReader obj2 = null;
		if(obj.exists()){
			try {
				obj1 = new FileReader(obj);
				obj2 = new BufferedReader(obj1);
				String s = obj2.readLine();
				while(s!=null){
					System.out.println(s);
					s = obj2.readLine();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally{
				try {
					obj2.close();
					obj1.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
