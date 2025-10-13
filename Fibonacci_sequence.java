package com.app;

import java.util.Scanner;

public class Fibonacci_sequence {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()-2;
		int first=0;
		int second=1;
		System.out.print(first+" "+second+" ");
		for(int i=0;i<n;i++) {
			int third=first+second;
			first=second;
			second=third;
			System.out.print(third+" ");
		}
	}

}
