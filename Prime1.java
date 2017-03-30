package ranga4;
public class Prime1 {
	int num = 9;
	boolean isPrime = true;
	public void method(){
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				isPrime = false;
				break;
			}
		}
			if(isPrime){
				System.out.println("is prime no");
			}
			else{
				System.out.println("is not a prime no");
			}
		}
	public static void main(String[] args) {
		Prime1 obj = new Prime1();
		obj.method();

	}

}
