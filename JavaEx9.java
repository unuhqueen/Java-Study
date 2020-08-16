package com.javateam.jse;

import java.util.Scanner;

public class JavaEx9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		char credit = 'F';
		
		if(score >= 90 && score <= 100) {
			credit = 'A';
		} else if(score >= 80 && score < 90) {
			credit = 'B';
		} else if(score >= 70 && score < 80) {
			credit = 'C';
		} else if(score >= 60 && score <= 69) {
			credit = 'D';
		} else {
			credit = 'F';
		}
		
		System.out.println(score + " 점수의 학점은 " + credit + "입니다.");
	}

}
