package ranga1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Testwriter1 {
	public static void main(String[] args) {
		File obj = new File("D:\\ranga1.txt");
		FileOutputStream obj1 = null;
			if(!obj.exists()){
				try {
					String s = "hello rangarao";
					obj1 = new FileOutputStream(obj);
					byte a[] = s.getBytes();
					obj1.write(a);
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

