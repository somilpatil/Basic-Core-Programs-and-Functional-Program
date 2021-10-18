package com.bl;
import java.lang.Math;

public class Factors {
	public static void primeFactors(int num) {
		while (num % 2 == 0) {
			System.out.print(2 + " ");
			num /= 2;
		}
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
		if (num > 2)
		System.out.print(num);
	}
	public static void main(String[] args) {
		int num = 10;
		primeFactors(num);
	}
}