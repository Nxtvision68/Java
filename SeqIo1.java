package ranga1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SeqIo1 {
	public static void main(String[] args) {
		FileInputStream obj =null;
		FileInputStream obj1 = null;
		FileOutputStream obj3 = null;
		SequenceInputStream obj4 = null;
		try {
			obj = new FileInputStream("D:\\ranga.txt");
			obj1 = new FileInputStream("D:\\ranga1.txt");
			obj3 = new FileOutputStream("D:\\ranga2.txt");
			obj4 = new SequenceInputStream(obj,obj1);
			int i = obj4.read();
			while(i!=-1){
				obj3.write(i);
				System.out.print((char)i);
				i = obj4.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				obj4.close();
				obj3.close();
				obj1.close();
				obj.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
