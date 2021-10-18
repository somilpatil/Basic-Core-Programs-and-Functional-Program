package com.bl;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int Tail=0, Head=0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want to flip the coin- ");
		int count=input.nextInt();
		for (int i=0; i<count; i++){
			if (Math.random() < 0.5)
				Tail++;
			else
				Head++;
		    }
		int headFlip=(100*Head)/count;
		int tailFlip=(100*Tail)/count;
		System.out.println("Percentage of Head is "+headFlip+" vs Tail is "+tailFlip);
		}
}


