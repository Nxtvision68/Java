package ranga3;
import java.util.Hashtable;
import java.util.Set;
public class Map3 {
	public void method(){
		Hashtable<Integer,String> Ht = new Hashtable<Integer,String>();
		Ht.put(1, "ranga");
		Ht.put(2, "sreenath");
		Ht.put(5, "vikram");
		Ht.put(4, "adarsh");
		Ht.put(3, "chandu");
		Set<Integer> keys = Ht.keySet();
		for(int k:keys){
			String s = Ht.get(k);
			System.out.println(k+":"+s);
		}
	}
	public static void main(String[] args) {
		Map3 obj = new Map3();
		obj.method();

	}

}
