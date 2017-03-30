package ranga;

public interface Rads {
	public void sum();
	public void diff();
public abstract class Gang implements Rads {
		int a=4,b=2,c;
		public void sum() {
			c = a + b;
			System.out.println("sum is:"+c);
		}
}
	class Bat extends Gang{
		public void diff(){
			c = a - b;
			System.out.println("sum is:"+c);
		}	
		public static void main(String[] args) {
			Bat obj = new Bat();
			obj.sum();
			obj.diff();

		}
	}
}
