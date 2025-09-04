package com.codegnan.controlstatements;
import java.util.Scanner;

public class POsitive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		if(a>=0) {
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
		sc.close();
	}

}
