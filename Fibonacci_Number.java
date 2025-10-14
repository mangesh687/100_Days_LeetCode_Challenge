package com.app;

import java.util.Scanner;

public class Fibonacci_Number {
	public static void main(String[] args) {
		//find the fibonacci number 
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0) {
			System.out.println("0");
		}else if(n==1) {
			System.out.println("1");
		}
		int first=0;
		int sencond=1;
		int third=0;
		for(int i=0;i<n;i++) {
			third=first+sencond;
			first=sencond;
			sencond=third;
			
		}
		System.out.println(third);
//		enter the number
//		5
//		8
	}

}
