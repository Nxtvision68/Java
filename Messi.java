package ranga;

	public class Messi {
	int a,b,c;
	public int div(int a,int b){
		try
		{
			c = a / b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("pls enter valid integer value in b");	
		}
		return c;
		
	}
}
	class Neymar extends Messi{
		public void sum(){
			int res = super.div(30,3);
			res=res+10;
			System.out.println(res);
		}
	public static void main(String[] args) {
		Neymar obj = new Neymar();
		obj.sum();

	}

}
