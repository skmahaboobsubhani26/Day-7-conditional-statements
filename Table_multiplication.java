package com.codegnan.controlstatements;
import java.util.Scanner;
public class Table_multiplication {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		int j=0;
		for(j=1;j<=20;j++) {
			System.out.println(i + "*" +j+"="+i*j);
		}
	}

}
