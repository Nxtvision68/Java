package ranga4;
public class Palindrome {
	public void method(){
		String s = "1221";
		StringBuffer s2 = new StringBuffer(s);
		StringBuffer s3 = s2.reverse();
		String s4 = s3.toString();
		if(s.equals(s4)){
			System.out.println("is palindrome number");
		}
		else{
			System.out.println("is not a palindrome no");
		}
	}

	public static void main(String[] args) {
		Palindrome obj =  new Palindrome();
		obj.method();
		

	}

}
