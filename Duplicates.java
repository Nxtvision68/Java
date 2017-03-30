package ranga3;
import java.util.ArrayList;
import java.util.Collections;
public class Duplicates {
	public void method(){
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(4);
		A.add(4);
		A.add(4);
		Collections.sort(A);
		for(int i=0;i<A.size()-1;i++){
			if(A.get(i)==A.get(i+1)){
				System.out.println(A.get(i+1));
			}
		}
	}
	
	public static void main(String[] args) {
		Duplicates obj = new Duplicates();
		obj.method();

	}

}
