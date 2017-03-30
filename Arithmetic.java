package ranga;
public class Arithmetic {
	 int a=20,b=30,c;
	 String s;
	public  void diff(){
		int c = a-b;
		System.out.println("diff is:"+c);
	}
	public void name(){
		s = "ranga";
		System.out.println("name is:"+s);
	}
	public void sum(){
		c=a+b;
		System.out.println("sum is:"+c);
	}	
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();
		obj.diff();
		obj.sum();
		obj.name();
		
	}

}

