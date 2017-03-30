package ranga4;
public class EvenOrOdd {
	int a;
	public void method(int a){
		if(a%2==0){
			System.out.println("is even");
		}
		else{
			System.out.println("is odd");
		}
	}
	public static void main(String[] args) {
		EvenOrOdd obj = new EvenOrOdd();
		obj.method(5);

	}

}
