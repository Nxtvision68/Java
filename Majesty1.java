package ranga;

	class TestThrows2 {
		int a=20,b=10,c;
	public void diff()throws ArithmeticException{
		throw new ArithmeticException("device error");
	}
	void sum() throws ArithmeticException{
		c = a + b;
		diff();
	}
	void div() throws ArithmeticException{
		try{
			c = a / b;
			sum();
		}
		catch(ArithmeticException ex){
			System.out.println("pls enter a valid integer in b");
		}
	}
	 public static void main(String args[]){ 
		 TestThrows2 obj = new TestThrows2();
		 obj.div();
	 }
}