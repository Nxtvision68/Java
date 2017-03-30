package ranga;
class ReverseString{
	public void rev(){
	String s1="hello world", reverse = "";
	int length = s1.length();
	for ( int i = length - 1 ; i >= 0 ; i-- )
    	reverse = reverse + s1.charAt(i);
    	System.out.println("rev is: "+reverse);
 }
	   public static void main(String args[]){
	      ReverseString obj = new ReverseString();
	      obj.rev();
	}
}
