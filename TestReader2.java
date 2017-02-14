package Prime;



import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader2 {
	public static void main(String[] args) {
		
		File file=new File("d:/Sampelly.txt");
	
		if(file.delete()){
			System.out.println("The File Sampelly is deleted:" );
		}
		else {
			System.out.println("The File Sampelly is not deleted:" );
		}
			
			
		}
	}

		