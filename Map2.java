package ranga3;
import java.util.Set;
import java.util.TreeMap;
public class Map2 {
	 public void method(){
		TreeMap<Integer,String> T = new TreeMap<Integer,String>();
		T.put(1, "ranga");
		T.put(2, "sreenath");
		T.put(5, "vikram");
		T.put(4, "adarsh");
		T.put(3, "chandu");
		Set<Integer> keys = T.keySet();
		for(int k:keys){
			String s = T.get(k);
			System.out.println(k+":"+s);
		}
	 }
	public static void main(String[] args) {
		Map2 obj = new Map2();
		obj.method();

	}

}
