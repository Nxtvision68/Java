package ranga1;
import java.util.Scanner;
public class Bank {
	Scanner sc= new Scanner(System.in);
	int PIN = sc.nextInt();
	int bal = 50000;
	public void Transaction(){
		if(PIN == 8143)
		{	
			System.out.println("1:Cash Withdrawl");
			System.out.println("2:cash deposit");
			System.out.println("3:mini statement");
			System.out.println("4:mobile number registration");
			System.out.println("5:PIN change");
			System.out.println("6:Balance Enquiry");
			int option = sc.nextInt();
				if(option == 1)
				{
					System.out.println("enter withdrwal amount");
					int num = sc.nextInt();
						if(num % 100!=0)
						{
							System.out.println("please enter the amount in multiples of 100");
						}	
						else if(num>bal)
						{
							System.out.println("Transcation declined due to insufficeint funds in your account");
						}
						else if(num > bal-5000)
						{
							System.out.println("you are withdrawing the amount from ur minimum balance");
						}
						else 
						{	
							System.out.println("Please collect your cash");
							System.out.println("Remaining balance is:"+(bal-num));
						}
						
				
				}
				else if(option == 2)
				{
					System.out.println("please Insert the cash into the machine");
					int cash= sc.nextInt();
						if( cash<100)
							{
								System.out.print("please insert cash in multiples of 100");
							}
						else
							{
								System.out.println("Verifying the cash...........");
							}
								System.out.println("guzzzzzzzzzzzzzzzzzz");
								System.out.println("your cash has been deposited successfully");
				}
				else if(option == 3)
				{
					System.out.println("please collect the receipt");
				}
				else if(option == 4)
				{
					System.out.println("please enter a 10 digit mobile number to register");
					long number = sc.nextLong();
						if(number<99999999999L)
							{
								System.out.println("your mobile number has been registered successfully");
							}
						else
							{
								System.out.println("please enter a valid 10 digit mobile number");
							}
				}
				else if(option == 5)
				{
					System.out.println("type your new PIN");
					int newPIN = sc.nextInt();
						if(newPIN<=9999)
						{
							System.out.println("your PIN has been changed Successfully");
						}
						else
						{
							System.out.println("please enter a valid 4 digit PIN");
						}
				}
				else if(option == 6)
				{
					System.out.println("Available balance in your account is:"+bal);
				} 
				System.out.println("Thank You for visiting State Bank ATM");	
		}
	else
	{
		System.out.println("Incorrect PIN");
	}
	
}

	public static void main(String[] args) {
		System.out.println("Welcome to SBI ATM");
		System.out.println("please enter your PIN");
		Bank obj =  new Bank();
		obj.Transaction();
	}
}
