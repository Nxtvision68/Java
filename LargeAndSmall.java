package ranga4;
public class LargeAndSmall {
	public void method(){
		int i[]={1,5,6,4,8,7,9,3,5};
		int maxvalue=i[0];
		for(int j=1;j<i.length;j++){
			if(i[j]>maxvalue){
				maxvalue=i[j];
			}
		}
		System.out.println(maxvalue);
		int minvalue=i[0];
		for(int k=1;k<i.length;k++){
			if(i[k]<minvalue){
				minvalue = i[k];
			}
		}
		System.out.println(minvalue);
	}
	public static void main(String[] args) {
		LargeAndSmall obj = new LargeAndSmall();
		obj.method();

	}

}
