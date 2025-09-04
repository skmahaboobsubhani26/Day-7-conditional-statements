package com.codegnan.controlstatements;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int a=num;
		int rev=0;
		while(num!=0) {
			int digit=num%10;
			rev=rev*10 + digit;
			num=num/10;
		}
		if(num==a) {
			System.out.println(a+" palindrome");
		}else {
			System.out.println(a+" not a palindrome");
		}

	}

}
