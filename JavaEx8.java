package com.javateam.jse;

import java.util.Scanner;

public class JavaEx8 {

	public static void main(String[] args) {
		//�ݾ� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ� �Է�: ");
		int money = sc.nextInt();
		
		String msg = "";
		
		money = money / 1000;
		switch(money) {
		case 1: msg = "�ﰢ����� �Դ�."; break;
		case 2: msg = "�ﰢ���� �Ŷ���� �Դ�."; break;
		case 3: case 4: case 5:
			msg = "�ܹ��ſ� �ֽ��� �Դ�."; break;
		default: msg = "������� �߰��ٸ� �Դ�.";
		}
		
		System.out.println(msg);
		sc.close();
	}

}

