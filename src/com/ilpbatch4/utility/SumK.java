package com.ilpbatch4.utility;

public class SumK {
 
	public static void main(String[] args) {
		int array[]= {-1,5,7,1};
		int sum=6;
		countPairs(array,sum);
 
	}
 
	private static void countPairs(int[] array, int sum) {
		int count=0;
		for(int i=0;i<array.length;i++)
			for(int j=i;j<array.length;j++)
				if((array[i]+array[j])==sum)
						count++;
		System.out.printf("Count of pairs is "+count);
		
	}
 
}