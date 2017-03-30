package ranga;

	public class Hyd {
	int a,b,c;
	public void div(int a,int b){
			try
			{
			c=a/b;
			System.out.println("div is:"+c);
			}
			catch(ArithmeticException ex){
			System.out.println("valid integer");
			}
}
	public static void main(String[] args) {
		Hyd obj = new Hyd();
		obj.div(20,10);
		}
	}

