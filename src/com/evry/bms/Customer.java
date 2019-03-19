package com.evry.bms;

import java.util.Scanner;

public class Customer 
{
	public static String bankname = "EVRYBANK";
	public String name;
	public double balance;
	public Customer(String name) 
	{
		super();
		this.name = name;
		//this.balance = balance;
	}
	public void deposit(double amount)
	{
		this.balance += amount;
		System.out.println("After Deposit The Balance is:" + this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount > balance)
		{
			System.out.println("Sorry ... Insufficent Funds...can not perform this operation");
			System.exit(0);
		}
		else
		{
		    this.balance -= amount;
		    System.out.println("After Withdraw The Balance is:" + this.balance);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to " + Customer.bankname);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name = sc.next();
		Customer obj = new Customer(name);
		System.out.println("Hello " +obj.name+", Your Account Got Created Successfully");
		while(true)
		{
		   System.out.println("Choose an Option:");
		   System.out.println("D-Deposit\nW-Withdraw\nE-Exit\nC-Check Balance");
		   String option = sc.next();
		   if(option.equalsIgnoreCase("D"))
		   {
			   System.out.println("Enter Amount:");
			   double amount = sc.nextDouble();
			   obj.deposit(amount);
		   }
		   else if(option.equalsIgnoreCase("W"))
		   {
			   System.out.println("Enter Amount:");
			   double amount = sc.nextDouble();
			   obj.withdraw(amount);
		   }
		   else if(option.equalsIgnoreCase("E"))
		   {
			   System.out.println("Thanks For Banking");
			   System.exit(0);
		   }
		   else
		   {
			   System.out.println("Plese Choose Valid Option");
		   }
		}
	}

}
