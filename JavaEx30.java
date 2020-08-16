package com.javateam.jse;

public class JavaEx30 {

	public static void main(String[] args) {
		int [][] arr = new int[3][2];
		arr[0][0] = 1;
		arr[1][1] = 2;
		arr[2][1] = 3;
		
		for(int i = 0; i<arr.length; i++) { //arr.length는 행의 개수가 나온다
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int arr2[] : arr) {
			for(int a : arr2) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}
