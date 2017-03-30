package ranga;

public class SingleMultiple {
	static int a=40,b=20,c;
	static public void sum(){
		c = a + b;
		System.out.println("sum is:"+c);
	}
}
	 class Bat extends SingleMultiple{
		static public void diff(){
			c = a - b;
			System.out.println("diff is:"+c);
		}
}
	 class Cat extends Bat{
		static public void mul(){
			c = a * b;
			System.out.println("mul is:"+c);
		}
	}
	class Dal extends Cat{
		static public void div(){
			c= a / b;
			System.out.println("div is:"+c);
		}
	public static void main(String[] args) {	
		Dal.sum();
		Dal.diff();
		Dal.mul();
		Dal.div();



	}

}
