package com.codegnan.controlstatements;
import java.util.Scanner;
public class Student_grades {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int Marks =sc.nextInt();
		if(Marks>=90){
			System.out.println("O grade");
		}else {
			if(Marks>=80) {
				System.out.println("A grade");
			}else {
				if(Marks>=70) {
					System.out.println("B grade");
				}else {
					if(Marks>=60) {
						System.out.println(" C grade");
					}else {
						if(Marks>=50) {
							System.out.println("D grade");
						}else {
							if(Marks>=35) {
								System.out.println("E grade");
							}else {
								System.out.println("fail");
							}
						}
					}
				}
			}
		}
		}
}
