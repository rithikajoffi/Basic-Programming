package com.ilpbatch4.utility;

public class SumOfSeries4 {

			public static void main(String[] args) {
				
				int input = 3;
				sumOfFactorial(input);

			}

			private static void sumOfFactorial(int input) {

				float sum = 0;
				for (int i = 1; i <= input; i++) {
					sum = sum + ((float) i / (float) factorialOfNumber(i));
				}
				System.out.println("Sum of factorial = " + sum);
			}

			private static int factorialOfNumber(int input) {

				int factorial = 1;
				for (int i = 1; i <= input; i++) {
					factorial = (factorial * i);
				}
				return factorial;
			}

		}

