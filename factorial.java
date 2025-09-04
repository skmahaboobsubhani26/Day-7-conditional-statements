package com.codegnan.controlstatements;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number to factorial");
		int i=sc.nextInt();
		 int r=1;
		 for(int j=1;j<=i;j++) {
			 r=r*j;
			 System.out.println(r);
		 }
	}

}
