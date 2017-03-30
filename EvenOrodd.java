package ranga;
public class EvenOrodd {
	int a;
	public void even(int a){
	if (a % 2 == 1)
	{
		System.out.println("given no is odd");
	}
	else
	{
		System.out.println("given no is even");
	}
}
	public static void main(String[] args) {
	EvenOrodd obj =new EvenOrodd();
	obj.even(11);

	}

}
