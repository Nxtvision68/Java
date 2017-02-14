package Prime;
import java.io.File;

public class FileReader {
	public static void main(String[] args) {
		File file = new File("d:\\Sampelly.txt");
		FileReader reader = null;
		if(file.exists()){
			reader= new FileReader();
			int data = 0;
			while(data!=-1){
				System.out.println(data);
				data = reader.read();
			}
    
	}
	}
}

	