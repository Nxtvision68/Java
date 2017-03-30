package ranga1;

	public class Hyd {
	int a,b,c;
	public void div(int a,int b){
			try
			{
			c=a/b;
			System.out.println("div is:"+c);
			}
			catch(Exception ex){
			System.out.println("pls enter a valid integer in b");
			}
}
	public static void main(String[] args) {
		Hyd obj =  new Hyd();
		obj.div(20,10);
	}
}
