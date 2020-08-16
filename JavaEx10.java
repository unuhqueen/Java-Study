package com.javateam.jse;

import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력: ");
		int score = sc.nextInt();
		char credit = 'F';
		
		credit = (score >= 90 && score <= 100) ? 'A':
			     (score >= 80 && score < 90) ? 'B':
				 (score >= 70 && score < 80) ? 'C':
				 (score >= 60 && score < 70) ? 'D':
				 'F';
		
		System.out.println(score + " 점수의 학점은 " + credit + "입니다.");
	}

}
