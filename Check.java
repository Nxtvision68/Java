package ranga;
public interface Check {
	public  void sum(int a,int b);
	public  void diff(int a,int b);
	public class Method implements Check {
		int a,b,c;
		public void sum(int a,int b) {
			c=a+b;
			System.out.println("sum is:"+c);
		}

		public  void diff(int a,int b) {
			c=a-b;
			System.out.println("diff is:"+c);
		}
		public static void main(String[] args) {
			Check obj = new Method();
			obj.sum(40,20);
			obj.diff(20, 10);
		}

	}
}
	
