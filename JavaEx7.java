package com.javateam.jse;

import java.util.Scanner;

public class JavaEx7 {

	public static void main(String[] args) {
		//�ݾ� �Է�
				Scanner sc = new Scanner(System.in);
				System.out.println("�ݾ� �Է�: ");
				int money = sc.nextInt();
				
				String msg = "";
				
				msg = (money >= 1000 && money < 2000) ? "�ﰢ����� �Դ�.":
					  (money >= 2000 & money < 3000) ? "�ﰢ���� �Ŷ���� �Դ�.":
					  (money >= 3000) ? "�ܹ��ſ� �ֽ��� �Դ�.":
					  "������� �߰��ٸ� �Դ�.";
				
				System.out.println(msg);
				sc.close();
	}

}
