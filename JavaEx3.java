package com.javateam.jse;

public class JavaEx3 {
	public static void main(String[] args) {
		int num = 10;
		num = 012; //8����
		num = 0xa; //16����
		num = 0B01010; //2����
		System.out.println(num);
		
		byte num1 = 1;
		System.out.println("byte�� ����: " + Byte.MIN_VALUE
				+ " ~ "+Byte.MAX_VALUE);
		System.out.println("short�� ����: " + Short.MIN_VALUE
				+ " ~ "+Short.MAX_VALUE);
		System.out.println("int�� ����: " + Integer.MIN_VALUE
				+ " ~ "+Integer.MAX_VALUE);
		System.out.println("char�� ����: " + (int)Character.MIN_VALUE
				+ " ~ "+(int)Character.MAX_VALUE);
		System.out.println("float�� ����: " + Float.MIN_VALUE
				+ " ~ "+Float.MAX_VALUE);
		System.out.println("double�� ����: " + Double.MIN_VALUE
				+ " ~ "+Double.MAX_VALUE);
		System.out.println("boolean�� ����: " + false
				+ " ~ "+true);
	}
}
