package com.javateam.jse;

import java.util.Scanner;

public class JavaEx11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int score = sc.nextInt();		
		char credit = 'F';

		switch(score/10) {
		case 10: case 9:
			credit = 'A'; break;
		case 8: credit = 'B'; break;
		case 7: credit = 'C'; break;
		case 6: credit = 'D'; break;
		default: credit = 'F'; break;
		}
		
		System.out.println(score + " ������ ������ " + credit + "�Դϴ�.");

	}

}
