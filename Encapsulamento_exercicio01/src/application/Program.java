package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderName = sc.nextLine();		
		System.out.print("Is there any initial deposit (y/n)? ");
		char x = sc.next().charAt(0);
		if (x == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			account = new Account(holderName, accountNumber, balance);		
		}
		else {
			account = new Account(holderName, accountNumber);
		}	
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();	
		account.deposit(deposit);		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();	
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();	
		account.withdraw(withdraw);			
		System.out.println("Updated account data:");
		System.out.println(account);		
			
		
		sc.close();
	}
}
