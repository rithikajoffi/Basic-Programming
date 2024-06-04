package com.ilpbatch4.utility;
 
public class SubArray {
 
	public static void main(String[] args) {
		int array[]= {1,4,20,3,10,5};
		int len=array.length;
		int sum=25;
		subArray(array,len,sum);
 
	}
 
	private static void subArray(int[] array, int len, int sum) {
		for(int i=0;i<len;i++) 
		{
			int currSum=array[i];
			
			if(currSum==sum) 
			{
				System.out.println("Sum found at the index "+i);
				return;
			}
			else 
			{
				for(int j=i+1;j<len;j++) 
				{
					currSum+=array[j];
					if(currSum==sum) 
					{
						System.out.println("Sum found between index "+i+" and "+j);
						return;
					}
				}
			}
		}
		System.out.println("No subarray found");
		return;
	}
 
}
 