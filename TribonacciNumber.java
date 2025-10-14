package com.app;

import java.util.Scanner;

public class TribonacciNumber {
	public static void main(String[] args) {
		//T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 
		System.out.println("ENTER THE NUMBER");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt()-3;
		int first=0;
		int second=1;
		int third=first+second;
		int fourth=0;
		System.out.print(first+" "+second+" "+third+" ");
		for(int i=0;i<n;i++) {
			fourth=first+second+third;
			first=second;
			second=third;
			third=fourth;
			System.out.print(fourth+" ");
			
		}
		
		
		
	}

}
