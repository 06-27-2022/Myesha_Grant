package com.Reimbursement;

import java.util.Scanner;

public class ExpenseReimbursement{

	public static void main(String[] args)
	{
Scanner scan = new Scanner(System.in);
		
		System.out.print("Username: ");
		
		String username = scan.nextLine();
				
		System.out.print("Password: ");
		String password = scan.nextLine();
		
		
		System.out.println("Login Accepted! ");
		
		scan.close();
		
	}
}
