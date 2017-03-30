package ranga3;
import java.util.LinkedList;
public class Array2 {
	public void method(){
	LinkedList<Integer> L = new LinkedList<Integer>();
	L.add(1);
	L.add(2);
	L.add(3);
	L.add(4);
	L.add(5);
	LinkedList<Integer> L1 = new LinkedList<Integer>();
	L1.addAll(L);
	L1.add(6);
	L1.remove(3);
	for(int i:L1){
		System.out.println(i);
	}
	System.out.println(L1.isEmpty());
	System.out.println(L1.size());
	System.out.println(L.contains(5));
	}
	public static void main(String[] args) {
		Array2 obj = new Array2();
		obj.method();
	}

}
