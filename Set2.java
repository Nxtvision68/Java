package ranga3;
import java.util.TreeSet;
public class Set2 {
	public void method(){
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(4);
		t.add(3);
		t.add(5);
		t.add(2);
		TreeSet<Integer> t2 = new TreeSet<Integer>();
		t2.addAll(t);
		t2.add(1);
		for(int i:t2){
			System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		Set2 obj = new Set2();
		obj.method();
		
		
		
		
		
		
		
		
		
		
		
	}

}
