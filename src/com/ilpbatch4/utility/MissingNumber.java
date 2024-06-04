package com.ilpbatch4.utility;
 
public class MissingNumber {
 
	public static void main(String[] args) {
		int array[]= {1,3,5,7,8};
		int input=10;
		missingNumber(array,input);
 
	}
	private static void missingNumber(int[] array, int input) {
		int flag;
		for(int i=1;i<=input;i++)
		{
			flag=0;
			for(int j=0;j<array.length;j++)
			{
				if(array[j]==i)
					flag=1;
			}
			if(flag==0) {
				System.out.println(i+" is missing");
			}
		}
		
		
	}
 
}