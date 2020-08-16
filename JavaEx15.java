package com.javateam.jse;

public class JavaEx15 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 10; i >= 1; i--) {
			sum += i;
			System.out.printf("%d ~ %d까지의 합: %d\n", 10, i, sum);
		}
	}

}
