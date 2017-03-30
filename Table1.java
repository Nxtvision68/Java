package ranga4;
public class Table1 {
	public void method(int value){
		 for(int i=1;i<=10;i++){
			 System.out.println(value*i);
		 }
	}

	public static void main(String[] args) {
		Table1 obj = new Table1();
		obj.method(5);

	}

}
