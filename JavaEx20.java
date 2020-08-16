package com.javateam.jse;

public class JavaEx20 {

	public static void main(String[] args) {
		int i = 2, j = 1;
		
		while(i <= 9) {
			while(j <= 9) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
				j++;
			}
			i++;
			j = 1;
			System.out.println("---------------------");
		}
	}

}
