package com.javateam.jse;

public class JavaEx29 {

	public static void main(String[] args) {
		String twice[] = new String[9];
		//�̻��¿��� �⺻�� null, int�� ��� �⺻�� 0
		twice[0] = "����";
		twice[1] = "����";
		twice[2] = "���";
		twice[3] = "�糪";
		twice[4] = "��ȿ";
		twice[5] = "ä��";
		twice[6] = "����";
		twice[7] = "�̳�";
		twice[8] = "����";
		
		System.out.println(twice[2]);
		
		System.out.println("------------");
		
		for(int i = 0; i < twice.length; i++) {
			System.out.println(twice[i]);
		}
		
		System.out.println("------------");
		
		//foreach��: "����(next)" ��� �˻��ϴ� ���
		//����(index) �˻� ���(x) -> �ٷ��� ���� ���!
		for(String s : twice) {
			System.out.println(s);
		}
		
		String [] twice2 = new String[]{"����", "����", "����", "��ȿ", "����", "ä��","���","�̳�","�糪"};
		//new String[] ��� ��, [] �ȿ� ���� ���� error
		for(int i = 0; i<twice2.length; i++) {
			System.out.println(twice2[i]);
		}
	}

}
