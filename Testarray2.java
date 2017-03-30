package ranga;

public class Testarray2{ 
	static int a[]={33,3,4,5};
public void min(int arr[]){  
	  int min=arr[0];  
	  for(int i=1;i<arr.length;i++)  
		  if(min>arr[i])  
			  min=arr[i];  
  
	  System.out.println(min);  
}  
public static void main(String args[]){  
	Testarray2 obj = new Testarray2();
	obj.min(a);
  
}} 