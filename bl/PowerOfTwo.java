package com.bl;
import java.lang.Math;

public class PowerOfTwo {
	public static void main(String[] args) {
		int power = (int)((Math.random()*32) % 31);
		System.out.println("power value"+ power);
		for (int i = 1; i <=power ; i++) {
			int result = (int)Math.pow(2,i) ;
	        System.out.println(result);
		}
	}
}
