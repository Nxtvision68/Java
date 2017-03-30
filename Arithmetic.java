package ranga1;
public class Arithmetic {
	int a=40,b=20,c;
	public void sum(){
		c=a+b;
		System.out.println(c);
	}
	public void diff(){
		c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Arithmetic obj =  new Arithmetic();
		obj.sum();
	}

}
