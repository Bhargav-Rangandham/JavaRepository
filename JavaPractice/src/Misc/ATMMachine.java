package Misc;

import java.util.Scanner;

public class ATMMachine {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the password to Login: ");
		int userpswrd = scn.nextInt();
		
		String First_Name = "Bhargav";
		String Last_Name ="Ranganadham";
		int Balance = 10000;
		int Password = 9619;
		
		if(userpswrd==Password) {
		
			System.out.println("Hi "+First_Name+" "+Last_Name+ " Welcome to RBR Banking\n\nPlease choose below options\n1. Cash Withdraw\n2. Deposit Money\n3. Balance Check\n4. Help");
			System.out.println(">");
			int option = scn.nextInt();
			
			if(option>=1 && option<=4) {
				
				switch(option) {
				
				case 1:
					System.out.println("Welcome to Cash Withdrawl page\n");
					
					System.out.println("Enter the ammount to withdraw:\n ");
					int withdrawamount = scn.nextInt();
					
					if(withdrawamount<=Balance) {
						Balance = Balance-withdrawamount;
						System.out.println("Please collect the Money: "+withdrawamount);
						System.out.println("Remaining Balance :" +Balance);
					}
					else if(withdrawamount>=Balance){
						System.out.println("Insufficient Balance :" +Balance);
						
					}
					else {
						System.out.println("Enter the Proper Input:(");
					}
					
					break;
				
				
				case 2:
					System.out.println("Welcome to Deposit Money Page");
					
					
					System.out.println("Enter the Amount to Deposit:");
					int Deposit_Money = scn.nextInt();
					Balance = Balance+Deposit_Money;
					
					System.out.println("New Balance: \n" + "$"+Balance);
					break;
				
				
				case 3:
					System.out.println("Welcome to Balance Enquiry Page\n");
					System.out.println("Your Account Balance is: " + "$"+Balance);
					break;
				
				case 4:
					
					System.out.println("We are here to Help You!\n Please Choose the below options\n 1. Password Change\n 2. Name Change");
					int option1 = scn.nextInt();
					if(option1>=1 && option1<=2) {
						
						switch(option1) {
					
							case 1:
								System.out.println("Enter the New password: ");
								int new_password = scn.nextInt();
								Password = new_password;
								System.out.println("New password is: "+Password);
								break;
					
							case 2:
								System.out.println("Please Enter the First Name: ");
								String First_Name1 = scn.next();
								System.out.println("Please Enter the Last Name: ");
								String Last_Name1 = scn.next();
								
								System.out.println("\nName Updated to: " +First_Name1 +" "+ Last_Name1 );
						}
				
					}
					else {
						System.out.println("Choose correct option from 1 & 2 !!!");
					}
					break;
				}
			
			}
			else {
				System.out.println("Choose the correct Option from 1-3!!!");
			}
		}
		else {
			System.out.println("You have entered wrong password!!!\nPlease try again...");

		}	
	}

}