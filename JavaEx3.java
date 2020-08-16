package com.javateam.jse;

public class JavaEx3 {
	public static void main(String[] args) {
		int num = 10;
		num = 012; //8진수
		num = 0xa; //16진수
		num = 0B01010; //2진수
		System.out.println(num);
		
		byte num1 = 1;
		System.out.println("byte의 범위: " + Byte.MIN_VALUE
				+ " ~ "+Byte.MAX_VALUE);
		System.out.println("short의 범위: " + Short.MIN_VALUE
				+ " ~ "+Short.MAX_VALUE);
		System.out.println("int의 범위: " + Integer.MIN_VALUE
				+ " ~ "+Integer.MAX_VALUE);
		System.out.println("char의 범위: " + (int)Character.MIN_VALUE
				+ " ~ "+(int)Character.MAX_VALUE);
		System.out.println("float의 범위: " + Float.MIN_VALUE
				+ " ~ "+Float.MAX_VALUE);
		System.out.println("double의 범위: " + Double.MIN_VALUE
				+ " ~ "+Double.MAX_VALUE);
		System.out.println("boolean의 범위: " + false
				+ " ~ "+true);
	}
}
