package com.javateam.jse;

import java.util.Scanner;

public class JavaEx6 {

	public static void main(String[] args) {
		//�ݾ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ� �Է�: ");
		int money = sc.nextInt();
		
		String msg = "";
		
		if(money >= 1000 && money < 2000) {
			msg = "�ﰢ����� �Դ�.";
		} else if(money >= 2000 && money < 3000) {
			msg = "�ﰢ���� �Ŷ���� �Դ�.";
		} else if(money >= 3000) {
			msg = "�ܹ��ſ� �ֽ��� �Դ�.";
		} else {
			msg = "���� ���� �߰��ٸ� �Դ�.";
		}
		
		System.out.println(msg);
		sc.close();
	}

}
