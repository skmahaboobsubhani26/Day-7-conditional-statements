package com.codegnan.controlstatements;
import java.util.Scanner;
public class Canteen_bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tea=10;
		int cof=15;
		int sam=20;
		int teaq=0,cofq=0,samq=0;
		int choice;
		double taxr=0.05;
		do {

			System.out.println("===Canteen Menu===");
			System.out.println("  1.view menu");
			System.out.println("  2.order items");
			System.out.println("  3.view bill");
			System.out.println("  4.exit");
			System.out.println("enter  number");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("=========menu ======");
				System.out.println("  1.tea    ="+tea+"rs");
				System.out.println("  2.coffee ="+cof+"rs");
				System.out.println("  3.samosa ="+sam+"rs");
			    break;
			case 2:
				System.out.println("enter  item number 1-3:1 for tea;2 forcoffee;3 for samosa");
				int item=sc.nextInt();
				System.out.println("enter quantity");
				int quan=sc.nextInt();
				if(quan<=0) {
					System.out.println("quantity must be greater than 0");
				}
				switch(item) {
				case 1:
					teaq+=quan;
					System.out.println(teaq+ "teas added");
					break;
				case 2:
					cofq+=quan;
					System.out.println(cofq +"coffees added");
					break;
				case 3:
					samq+=quan;
					System.out.println(samq +"samosas added");
					break;
				default :
					System.out.println("Invalid item number so please choose between 1-3");
					break;
				}
				break;
			case 3:
				int teatotal=tea*teaq;
				int coftotal=cof*cofq;
				int samtotal=sam*samq;
				int subtotal=teatotal+coftotal+samtotal;
				double tax=taxr*subtotal;
				double grandtotal=tax+subtotal;
				System.out.println("===bill===");
				if(teaq>0) {
					System.out.println("tea"+teaq+"="+teatotal);
				}
				if(cofq>0) {
					System.out.println("cof  "+cofq+"="+coftotal);
				}
				if(samq>0) {
					System.out.println("sam"+samq+"="+samtotal);
				}
				if(subtotal==0) {
					System.out.println("no items ordered yet");
				}else {
					System.out.println("sub total amount="+subtotal);
					System.out.println("tax amount      ="+tax);
					System.out.println("grand total     ="+grandtotal);
				}
				
				break;
			case 4:
				System.out.println("thankyou .existing system");
				break;
		default:
			System.out.println("invalid choice");
			break;
			}
		}while(choice!=4);
		sc.close();
		}
	}
	


