package ranga;
public class Abs {
	int a=40,b=20,c;
	public void sum(){
		c = a + b;
		System.out.println("sum is:"+c);
	}
}
	abstract class Bell1 extends Abs{
	public void diff(){
		c = a - b;
		System.out.println("diff is:"+c);
	}
	public void mul(){
		c = a * b;
		System.out.println("mul is:"+c);
	}
}
	class Canada extends Bell1{
		public void div(){
			c=a/b;
			System.out.println("div is:"+c);
		}
	public static void main(String[] args) {
		Canada obj = new Canada();
		obj.div();
	}

}
