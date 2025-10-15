package com.app;

import java.util.Scanner;

public class Water_Bottles_problem {
public static void main(String[] args) {
//	There are numBottles water bottles that are initially full of water.
//	You can exchange numExchange empty water bottles from the market with one full water bottle.
//
//	The operation of drinking a full water bottle turns it into an empty bottle.
//
//	Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of numbottles");
	int numBottles=sc.nextInt();
	System.out.println("enter the number of numExchange ");
	int numExchange=sc.nextInt();
	int ans=numBottles;
	while(numBottles>=numExchange) {
		
		int newbottles=numBottles/numExchange;
		int remBottles=numBottles%numExchange;
		ans=ans+newbottles;
		numBottles=newbottles+remBottles;
	}
	System.out.println("maximaum number of water bottles you can drink "+ans);
}
}
