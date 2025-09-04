package com.codegnan.controlstatements;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int reverse_number=0;
		
		while(i<0 || i>0) {
			
			reverse_number=reverse_number*10+i%10;
			i=i/10;
		}	if(reverse_number<0) {
			System.out.println(-1*reverse_number);
		}else
					System.out.println(reverse_number);

		sc.close();

	}

}
