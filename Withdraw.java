package com.codegnan.controlstatements;
import java.util.Scanner;
public class Withdraw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a= 50000.0;
		System.out.println("enter withdraw amount");
		double b =sc.nextDouble();
		if(b<=a) {
			a-=b;
			System.out.println("withdraw "+ b +  ":remaining amount" +a);
			}else {
				System.out.println("no money");
			}
		
		sc.close();
	}

}
