package srinivas;
public class compareToExample{
	public static void main(String[] args) {  
		String s= "  Sachin ramesh tendulkar ";
		String s1="    Sachin ramesh tendulkar   ";
		String s2="Rahul dravid";
		String s3= new String("adarsh");
		String s4 = s3.intern();
		int a=10;
		String s5= String.valueOf(a);
		System.out.println(s+10);
		System.out.println(s.substring(6));
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.compareTo(s1));
		System.out.println(s==s1);
		System.out.println(s1.compareToIgnoreCase(s));
		System.out.println(s.compareTo(s2));
		System.out.println(s.concat(s2));
		System.out.println(s2.intern());
	} 
}



