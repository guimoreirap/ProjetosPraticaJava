package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.LimitException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			System.out.print("Holder: ");
			String holder = sc.next();
			
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double value = sc.nextDouble();
			account.withdraw(value);
			
			System.out.println("New balance: " + account.getBalance());
		} catch (Exception e) {
			System.out.println("Withdraw error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}

