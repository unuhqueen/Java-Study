package com.javateam.jse;

public class JavaEx14 {
	public static void main(String[] args) {
		int i = 2, sum = 0;
		
		for(;;) {
			if(i <= 10) {
				//sum = sum + i;
				sum += i;
				System.out.println("sum: "+sum);
				i += 2;
				//sum += i+=2; (¹ø¿ÜÆí)
			}else {
				break;
			}
		}
	}

}
