package Prime;
import java.io.*;
import java.io.FileReader;
public class FileWriter1 {

	public void FW(){
				FileWriter Writer = null;
				File file = new File("d:/Sampelly3.txt");
				try {
					Writer = new FileWriter(file);
					Writer.write("Fc Barcelona");
					
				}
				catch (Exception e){
					System.out.println("FileNotFound");
					
				}
				finally {
					try {
						Writer.close();
					}
					catch(Exception ex){
						System.out.println("Please Close The File");
					}
				}
	}

}
class Reader5 extends FileWriter1{
	public void TestReader(){
		FileReader reader=null;
		File file=new File("d:/Sampelly3.txt");
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
	public static void main(String[] args){
	Reader5 obj = new Reader5();
	obj.FW();
	obj.TestReader();
		
	}
}
	
