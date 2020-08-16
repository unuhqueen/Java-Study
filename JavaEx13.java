package com.javateam.jse;

public class JavaEx13 {

	public static void main(String[] args) {
		int sum = 0;
		
//		for(int i = 1; i<= 10; i++) {
		for(int i = 2; i< 11; i += 2) { //Â¦¼öÀÇ ÇÕ
			sum = sum + i;
			System.out.println("sum: " + sum);
		}
		
		System.out.println("------------------");
		
		sum = 0;
		int j = 2;
		for(; j < 11; j+=2) {
			sum = sum + j;
			System.out.println("sum: " + sum);
		}
		
		System.out.println("------------------");
		
		sum = 0;
		int k = 2;
		for(; ; k+=2) {
			if(k <= 10) {
				sum = sum + k;
				System.out.println("sum: "+sum);
			}else {
				break;
			}
		}
	}

}
