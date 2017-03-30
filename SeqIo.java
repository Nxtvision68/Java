package ranga1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
public class SeqIo {
	public static void main(String[] args) {
		File obj =  new File("D:\\ranga.txt");
		File obj1 = new File("D:\\ranga1.txt");
		FileInputStream obj2 = null;
		FileInputStream obj3 = null;
		SequenceInputStream obj4 = null;
		try {
			obj2 = new FileInputStream(obj);
			obj3 = new FileInputStream(obj1);
			obj4 = new SequenceInputStream(obj2,obj3);
			int i = obj4.read();
			while(i!=-1){
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
				obj2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
