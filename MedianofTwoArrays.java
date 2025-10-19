package com.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedianofTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,6,10};
		int[] b= {10,20};
		List<Integer> sc=Stream.of(a,b).flatMapToInt(Arrays::stream).sorted().boxed().collect(Collectors.toList());
		int n =sc.size();
		if(n%2==0) {
			System.out.println((sc.get(n/2)-1+sc.get(n/2))/2);
		}else {
			System.out.println(sc.get(n/2));
		}
	}

}
