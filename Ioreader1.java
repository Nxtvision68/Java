package ranga1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Ioreader1 {
	public static void main(String[] args) {
		File obj = new File("D:\\ranga1.txt");
		FileInputStream obj1 = null;
		BufferedInputStream obj2 = null;
		if(obj.exists()){
			try {
				obj1 = new FileInputStream(obj);
				obj2 = new BufferedInputStream(obj1);
				int i = obj2.read();
				while(i!=-1){
					System.out.println((char)i);
					i = obj2.read();
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
