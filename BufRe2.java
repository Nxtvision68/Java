package Prime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufRe2 {
    public void BuffRe(){
    	  File file = new File("d:\\OptimusPrime.txt");
    	  FileInputStream fis = null;
    	  byte data[]=new byte[(int)file.length()];
    	  if (file.exists()){
    		  try{
    			  	fis = new FileInputStream(file);
					int i = fis.read(data);
					System.out.println(i);
					for(byte b : data){
						System.out.print((char)b);
					}
			
    		  }
    				  catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
    				  catch (Exception e1) {
  						// TODO Auto-generated catch block
  						e1.printStackTrace();
  			   }
    		  finally {
    			     try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    		  }
            }
        }
    public static void main(String[] args) {
		BufRe2 obj = new BufRe2();
		      obj.BuffRe();
     }
}  
