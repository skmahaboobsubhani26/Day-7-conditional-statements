package com.codegnan.controlstatements;

import java.util.Scanner;

public class Count_digits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int count=0;
		while(num!=0) {
			num/=10;
			int sum=num;
			
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
