package ranga3;
import java.util.ArrayDeque;
import java.util.Deque;
public class Queue1 {
	public void method(){
		Deque<Integer> q = new ArrayDeque<Integer>(); 
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.poll();
		for(int i :q){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Queue1 obj = new Queue1();
		obj.method();

	}

}
