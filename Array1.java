package ranga3;
import java.util.ArrayList;
public class Array1 {
	public void method(){
	ArrayList<String> A = new ArrayList<String>();
		A.add("abc");
		A.add("bcd");
		A.add("def");
		A.add("fgh");
	ArrayList<String> a1 = new ArrayList<String>();
		a1.addAll(A);
		a1.add("lmn");
		for(String s:a1){
			System.out.println(s);
		}
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		System.out.println(a1.indexOf("def"));
		System.out.println(a1.contains("lmn"));
		System.out.println(a1.isEmpty());
		
	}
	public static void main(String[] args) {
		Array1 obj = new Array1();
		obj.method();
	}

}
