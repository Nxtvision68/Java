package ranga4;
public class SumAndAverage {
	public void method(){
		int i[]={1,3,5,7};
		int sum=0;
		for(int num:i){
			sum = sum+num;	
		}
		System.out.println("sum is:"+sum);
		System.out.println("avg is:"+sum/i.length);
	}
	public static void main(String[] args) {
		SumAndAverage obj = new SumAndAverage();
		obj.method();
	}
}
