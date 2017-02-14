package Prime;



import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReaderS {
	public static void main(String[] args) {
		FileReader reader=null;
		File file=new File("d:/Sampelly2.txt");
		if(file.exists()){
			int data=0;
		try {
			reader=new FileReader(file);
			while(data!=-1){
				System.out.println(data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		finally{
			try {
				reader.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
	}
	}
}