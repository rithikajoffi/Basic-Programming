package com.ilpbatch4.utility;
 
public class AlphaNumericPattern {
 
	public static void main(String[] args) {
		int n=4;
		alphaNumericPattern(n);
 
	}
 
	private static void alphaNumericPattern(int n) {
		for(int i=1;i<=n;i++)
		{
			int a1='A';
			int n1=1;
			
			for(int j=1;j<=(2*n);j++) 
			{
				if(j>=n+1-i && (j<=n+i)) 
				{
					if(j<=n) 
					{
						System.out.print((char)a1);
						a1++;
					}
					else 
					{
						System.out.print(n1);
						n1++;
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
 