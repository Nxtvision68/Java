package ranga1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class TestReader2 {
	public static void main(String[] args) {
		File obj = new File("D:\\ranga.txt");
		FileInputStream obj1 = null;
			try {
				obj1 = new FileInputStream(obj);
				byte b[] = new byte[(int)obj.length()];
				obj1.read(b);
				for(byte a:b){
					System.out.println((char)a);
				}
			}catch (FileNotFoundException e) {
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

