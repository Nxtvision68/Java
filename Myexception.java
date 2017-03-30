package ranga;

public class Myexception {
	int a,b,c;
	public void sum(int a,int b){
		c = a + b;
		System.out.println("sum is:"+c);
	}
}
	class Exception extends Myexception{
		public void div(int a,int b){
			c = a / b;
			System.out.println("div is:"+c);
			}
		public static void main(String[] args) {
			 Exception obj = new Exception();
			 
	}

}
