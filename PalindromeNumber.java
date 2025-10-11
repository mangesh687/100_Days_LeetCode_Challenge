package com.app;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int orignal=x;
		int rev=0;
		if(x<0) {
			System.out.println("given number is not a palindrom number");
		}
		while(x>0) {
			//121
			int d=x%10;//1
			rev=rev*10+d;//0*10+1=1
			x=x/10;//12
			
		}
		if(orignal == rev) {
			System.out.println("given number is palindrom number");
		}else {
			System.out.println("given number is not a palindrom number");

		}
	}

}
