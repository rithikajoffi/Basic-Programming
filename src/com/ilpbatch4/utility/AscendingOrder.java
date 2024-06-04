package com.ilpbatch4.utility;

public class AscendingOrder {

	public static void main(String[] args) {
		int array[] = {5,3,9,2};
		ascendingOrder(array);
	}

	private static void ascendingOrder(int[] array) {
		int temp=0;
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[j]<array[i])
					{
						temp=array[j];
						array[j]=array[i];
						array[i]=temp;
					}
			}
		}
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]);
		}
	}
}
