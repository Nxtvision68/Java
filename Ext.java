package ranga;

public class Ext{
		int a,b,c;
		public int sum(int a,int b){
		c = a+b;
		System.out.println("sum is:"+c);
		return c;
		}
		public void diff(int a,int b){
		c = a-b;
		System.out.println("diff is:"+c);
		}
	}
	class C extends Ext{
		public void a(){
		int res=super.sum(40,20);
		res = c / 10;
		System.out.println("res:"+res);
		}
		public void b(){
			super.diff(40,20);
			c = c/10;
			System.out.println("c ="+c);
		}
	}
		class D extends Ext{
			public void e(){
				int res = super.sum(60, 30);
				res = c*10;
			System.out.println("e ="+res);	
			}
	public static void main(String[] args){
		D obj = new D();
		C obj1 = new C();
		obj.e();
		obj1.a();
	}

}
