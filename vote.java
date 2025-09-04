package com.codegnan.controlstatements;
import java.util.Scanner;
public class vote {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
System.out.println("enter the age");
int a =sc.nextInt();
if(a>=18) {
System.out.println("eligible");
	
}else {
	System.out.println("not eligible");
}
	}

}
