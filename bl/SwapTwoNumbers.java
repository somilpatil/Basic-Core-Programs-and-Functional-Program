package com.bl;
import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int firstNumber, secondNumber, thirdNumber;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter firstNumber");
		firstNumber = reader.nextInt();
		System.out.println("Enter secondNumber");
		secondNumber = reader.nextInt();
		System.out.println("before swapping numbers: " + firstNumber + "  " + secondNumber);
		thirdNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		System.out.println("After swapping: " + firstNumber + "   " + secondNumber);
		System.out.println();
	}
}

	
	