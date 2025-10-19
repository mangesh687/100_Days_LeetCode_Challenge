package com.app;

public class MaxoftwoProduct {
	public static void main(String[] args) {
		//Maximum Product of Two Elements in an Array
		int[] num= {10,10,2,5,9};
		int max=0;
		int smax=0;
		for(int i=0;i<num.length;i++) {
			if(max<num[i]) { //0<10
				smax=max; //smax=0
				max=num[i];//max=10
			}else if(smax<num[i]) { //0<10
				smax=num[i];//10
			}
			
		}
		System.out.println((max-1)+" "+(smax-1));
		System.out.println((max-1)*(smax-1));
	}

}
