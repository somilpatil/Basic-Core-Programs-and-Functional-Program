package com.bl;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] Strings) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		System.out.print("Enter the wind speed miles per hour: ");
		double speed = input.nextDouble();
		input.close();
		double windChillIndex = calculateWindChillIndex(fahrenheit, speed);
		System.out.println("The wind chill index is " + windChillIndex);
	}
	private static double calculateWindChillIndex(double fahrenheit, double speed) {
		double windChillIndex = 35.74 + 0.6215 * fahrenheit + (0.4275 * fahrenheit - 35.75) * Math.pow(speed, 0.16);
		return windChillIndex;
	}
}
