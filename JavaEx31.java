package com.javateam.jse;

public class JavaEx31 {

	public static void main(String[] args) {
		//int [][] arr = new int[][]; (X)
		//int [][] arr = new int[][]; (X)
		int [][] arr = new int[3][]; //가변 배열
		
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[7];
		
		for(int arr2[]:arr) {
			for(int a : arr2) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
