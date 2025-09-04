package com.codegnan.controlstatements;
import java.util.Scanner;
public class City_wishes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter city name");
		String a=sc.next();
		if(a.equalsIgnoreCase("hyderadad")) {
			System.out.println("hello hyderabadi -------- adaab");
		}else {
			if(a.equalsIgnoreCase("banglore")) {
				System.out.println("hello kannadi -------namaskar");
			}else {
				if(a.equalsIgnoreCase("gujarat")) {
					System.out.println("hello gujarati -----keem cho ");
				}else
				{
					System.out.println();
				}
			}
		}

	}

}
//positive or negative
//talk time less than 100 minutes basic plan  talk time >100 and <300
//