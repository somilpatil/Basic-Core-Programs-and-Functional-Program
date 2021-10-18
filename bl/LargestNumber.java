package com.bl;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		int a, b, c, largest, temp;
		Scanner num = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = num.nextInt();
		System.out.println("Enter the second number:");
		b = num.nextInt();
		System.out.println("Enter the third number:");
		c = num.nextInt();
		temp = a > b ? a : b;
		largest = c > temp ? c : temp;
		System.out.println("The largest number is: " + largest);
		}
}
