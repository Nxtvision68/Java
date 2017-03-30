package ranga4;
public class LeapYear {
	int year;
	public void method(int year){
		if(year%4==0){
			System.out.println("is leap year");
		}
		else{
			System.out.println("is not aleap year");
		}
	}
	public static void main(String[] args) {
		LeapYear obj = new LeapYear();
		obj.method(2017);

	}

}
