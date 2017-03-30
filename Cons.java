package ranga;

public class Cons {
	int a=40,b=20,c;
	  	public Cons() {
	  		c = a + b;
	    System.out.println("sum ="+c);
	  }
	} 
	class Cons2 extends Cons {
		public Cons2() {
			super();
			c=c*100;
	    System.out.println("diff ="+c);
	  }
}	
	class Cons3 extends Cons2{
		public Cons3(){
			c=a*b;
			System.out.println("mul ="+c);
}
	  public static void main(String[] args) {  
	    Cons3 obj = new Cons3();
	  }
}
