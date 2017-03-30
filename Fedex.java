package ranga;

public class Fedex {
	int a,b,c;
	public void sum(int a,int b){
		c=a+b;
		System.out.println("sum is:"+c);
	}
}
	class Nadal extends Fedex{
		public void div(int a,int b){
			try
			{
				c=a/b;
				System.out.println("div is:"+c);
			}
			catch(ArithmeticException ex){
				System.out.println("pls enter a valid input in b");
			}
		}
			public void diff(int a,int b){
				c=a-b;
				System.out.println("diff is:"+c);
			}
			public void mul(int a,int b){
				c=a*b;
				System.out.println("mul is:"+c);
			}
			public void mod(int a,int b){
				c=a%b;
				System.out.println("mod is:"+c);
			}
	public static void main(String[] args) {
			Nadal obj = new Nadal();
			obj.div(10,0);
			obj.sum(10, 20);
			obj.diff(10, 20);
			obj.mul(20, 30);
			obj.mod(10, 5);

	}

}
