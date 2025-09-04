package com.codegnan.controlstatements;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance =50000;
		int pin= 1234;//original pin
		int enteredPin;
		System.out.print("enter your pin:");
		enteredPin =sc.nextInt();
		if(enteredPin!=pin) {
			System.out.println("in correct pin");
		return;
		}
		int choice;

		System.out.println("===========================");
		System.out.println("=========ATM MENU==========");
		System.out.println("========1.CHECK BALANCE=======");
		System.out.println("========2.DEPOSIT=============");
		System.out.println("==========3.withdraw");
		System.out.println("==========4.exit");
		System.out.println(" =================================");
		System.out.println("enter your choice");
		choice =sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("your balance is:" + balance);
			break;
		case 2:
			System.out.println("enter deposit amount");
			double deposit =sc.nextDouble();
			if(deposit %100!=0) {
				System.out.println("pleASE enter multiples of 100");
			}else {
				if(deposit < 100) {
					System.out.println("deposite above 500");
				}else {
					balance+=deposit;
					System.out.println(deposit);
					System.out.println(balance);
					
				}
			}
			break;
		case 3:
			System.out.println("enter withdraw amount");
			double withdraw =sc.nextDouble();
			if(withdraw %100!=0) {
				System.out.println("pleASE enter multiples of 100");
			}else {
				if(withdraw< 100) {
					System.out.println("deposite above 500");
				}else {
					balance-=withdraw;
					System.out.println(withdraw);
					System.out.println(balance);
					
				}
			}
			break;
		case 4:
			System.out.println("exiting ===thankyou for visiting");
			break;
			default:
			System.out.println("invalid choice");
			break;
		}
		sc.close();
	}

}
