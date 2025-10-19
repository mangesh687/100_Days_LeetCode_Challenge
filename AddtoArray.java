package com.app;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddtoArray {

	public static void main(String[] args) {
	//Example 1:
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
	System.out.println("enter the k value");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("enter the size of array list");
		int n=sc.nextInt();
		 int[] num = new int[n];
		 System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            num[i] = sc.nextInt(); // fill the array
	        }
	        int sum=0;
	        for(int i=0;i<num.length;i++) {
	        	sum=sum*10+num[i];
	        }
	        sum=sum+k;
	        System.out.println(k);
	       
	        System.out.println(sum);
	      
	        List<Integer> ans=new LinkedList<>();
	   while(sum>0) {
		   int d=sum%10;
		   ans.add(d);
		   sum=sum/10;
	   }  
	   System.out.println(ans);
	   Collections.reverse(ans);
	   System.out.println(ans);
	        
	        
	}

}
