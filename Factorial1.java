package ranga4;
public class Factorial1 {
	int num=5,i,fact=1;
	public void method(){
		
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	public static void main(String[] args) {
		Factorial1 obj = new Factorial1();
		obj.method();
		}

	}

