package com.ilpbatch4.utility;

public class SunmOfSeries2 {

	public static void main(String[] args) {
		int input=4;
		int sum = sumOfSeries(input);
		System.out.println(sum);

	}

	private static int sumOfSeries(int input) {
		
		int first=1, second=2, sum=0, temp=0;
		
		if(input==1)
		{
			sum=sum+first;
			return sum;
		}
		else
		{
			sum=1;
			for(int i=2; i<=input; i++)
			{
				sum=sum+(second*second*second);
				temp=second;
				second=first+second;
				first=temp;
			}
		
			return sum;
		}

}}
