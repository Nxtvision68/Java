package ranga1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class BuffWriter {
	public static void main(String[] args) {
		File obj = new File("D:\\adarsh.txt");
		FileWriter obj1 = null;
		BufferedWriter obj2 = null;
		if(!obj.exists()){
			try {
				obj1 = new FileWriter(obj);
				obj2 = new BufferedWriter(obj1);
				obj.createNewFile();
				obj2.write("Formed in 1969, ISRO superseded the erstwhile Indian National");
				obj2.newLine();
				obj2.write("Committee for Space Research (INCOSPAR) established in 1962 by the");
				obj2.newLine();
				obj2.write("efforts of independent India's first Prime Minister, Jawaharlal Nehru,");
				obj2.newLine();
				obj2.write("and  his close aide and scientist Vikram Sarabhai.");
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally{
				try {
					obj2.close();
					obj1.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}

	}

}
