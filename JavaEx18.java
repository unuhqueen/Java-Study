package com.javateam.jse;

public class JavaEx18 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(true) {
			if(i<=10) {
				sum += i;
				System.out.println(sum);
				i++;
				//System.out.println(sum += i++);
			}else {
				break;
			}
		}
	}

}
