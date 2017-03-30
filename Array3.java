package ranga3;
import java.util.Vector;
public class Array3 {
	public void method(){
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		Vector<Integer> v1  = new Vector<Integer>();
		v1.addAll(v);
		System.out.println(v.size());
		for(int i:v1){
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Array3 obj = new Array3();
		obj.method();
	}

}
