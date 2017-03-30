package ranga3;
import java.util.HashSet;
import java.util.Iterator;
public class Set1 {
	public void method(){
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		 
		Iterator iterator=h.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		Set1 obj = new Set1();
		obj.method();

	}

}
