package ranga;

public interface Thar {
	public void sum();
	public void diff();
}
	abstract class Gambler implements Thar {
		int a,b,c;
		public void sum() {
			c = a + b;
			System.out.println("sum is:"+c);
		}
}
	class Colgate extends Gambler{
		public void diff(){
			
		}
		public static void main(String[] args) {
			Colgate obj = new Colgate();
			obj.sum();
		}		
}




