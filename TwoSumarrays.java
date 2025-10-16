package com.app;

import java.util.Scanner;

public class TwoSumarrays {
	public static void main(String[] args) {
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
		System.out.println("enter the to array size and enter the elements");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int[] nums=new int[a];
		System.out.println("enter the all elenemts "+nums.length);
		for(int i=0;i<nums.length;i++) {
			int b=sc.nextInt();
			nums[i]=b;
		}
		System.out.println("enetr the target sum ");
		int targetsum=sc.nextInt();
		int[] ans=new int[2];
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
			    if(nums[i]+nums[j]==targetsum) {
			    	ans[0]=i;
			    	ans[1]=j;
			    	break;
			    }
			    
			}
		}
		System.out.println("index of two sum number ");
	System.out.println(ans[0]+" "+ans[1]);	
//	enter the to array size and enter the elements
//	4
//	enter the all elenemts 4
//	2
//	3
//	5
//	4
//	enetr the target sum 
//	8
//	index of two sum number 
//	1 2
	}

}
