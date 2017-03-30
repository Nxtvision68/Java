package ranga4;
public class Arithmetic1 {
	int a=50,b=10,c;
	public void sum(){
		c=a+b;
		System.out.println(c);
	}
	public void diff(){
		c=a-b;
		System.out.println(c);
	}
	public void product(){
		c=a*b;
		System.out.println(c);
	}
	public void div(){
		c=a/b;
		System.out.println(c);
	}
	public void mod(){
		c=a%b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Arithmetic1 obj = new Arithmetic1();
		obj.sum();
		obj.diff();
		obj.product();
		obj.div();
		obj.mod();
	}

}
