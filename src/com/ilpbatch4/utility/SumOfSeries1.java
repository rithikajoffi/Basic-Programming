package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		int input = 3;
		sumOfSeries(input);
	}

	private static void sumOfSeries(int input) {
		if(input%2==0)
			System.out.print(-input);
		else
			System.out.print(input);
	}

}
