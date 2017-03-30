package ranga;

public class Inherit {
	int a,b,c;
	public void sum(int a,int b){
		c=a+b;
	System.out.println("sum is:"+c);
	}
	public void diff(int a,int b){
	c=a-b;
	System.out.println("diff is:"+c);
	}
	
}
	class b extends Inherit{
	public void mul(int a,int b){
		c=a*b;
		System.out.println("mul is:"+c);
	}
	public static void main(String[] args) {
	b obj = new b();
	obj.sum(40, 20);
	obj.diff(40,20);
	obj.mul(40, 20);		
}

}