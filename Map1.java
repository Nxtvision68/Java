package ranga3;
import java.util.HashMap;
import java.util.Set;
public class Map1 {
	public void method(){
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101,"ranga");
		hm.put(106,"sreenath");
		hm.put(102,"adarsh");
		Set<Integer> keys = hm.keySet();
		for(int k:keys){
			String s = hm.get(k);
			System.out.println(k+":"+s);
		}
	}

	public static void main(String[] args) {
		Map1 obj = new Map1();
		obj.method();

	}

}
