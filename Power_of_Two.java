package com.app;

import java.util.Scanner;

public class Power_of_Two {
	public static void main(String[] args) {
		System.out.println("enter the enter the number check given number is power of 2 or not ?");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		//x=2power(n)
		if(x<1) {
			System.out.println("this number is not power of 2");
		}
		while(x%2==0) {
			x=x/2;
		}
		if(x==1) {
		System.out.println("this number is power of 2");
		}else {
			System.out.println("this number is not power of 2");
		}
		
	}

}
