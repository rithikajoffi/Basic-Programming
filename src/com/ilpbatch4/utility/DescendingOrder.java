package com.ilpbatch4.utility;

public class DescendingOrder {

		public static void main(String[] args) {
			int num1=4, num2=3, num3=2;
			descendingOrder(num1, num2, num3);
		}

		private static void descendingOrder(int num1, int num2, int num3) {
			if(num1>num2 && num1>num3)
			{
				System.out.println(num1+" ");
				if(num2>num3)
					{System.out.println(num2+" ");System.out.println(num3+" ");}
				else
					{System.out.println(num3+" ");System.out.println(num2+" ");}
			}
			if(num2>num1 && num2>num3)
			{
				System.out.println(num1+" ");
				if(num1>num3)
					{System.out.println(num1+" ");System.out.println(num2+" ");}
				else
					{System.out.println(num2+" ");System.out.println(num1+" ");}
			}
			if(num3>num1 && num3>num2)
			{
				System.out.println(num3+" ");
				if(num1>num2)
					{System.out.println(num1+" ");System.out.println(num2+" ");}
				else
					{System.out.println(num2+" ");System.out.println(num1+" ");}
			}
		}

	}

