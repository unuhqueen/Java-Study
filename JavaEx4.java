package com.javateam.jse;

public class JavaEx4 {
	public static void main(String[] args) {
		byte num = 1;
		num = (byte)200; //200�� byte ���� ���� -> ����ȯ(type conversion, casting)
		System.out.println(num); //���� �ȿ��� ������ ������ �� -56�� ����
		// �ڷ����� �������� ��� ���� ����ȯ������ ���� �ս��� �߻�!
		
		int num1 = 120;
		num = (byte)num1;
		System.out.println(num);
		// ū �ڷ����� ����(��) -> ���� �ڷ����� ����(��)
		// ����(����) ����ȯ!
		
		int num2 = num; //����->ū: �ڵ���ȯ
		
		char ch = 'A';
		//char ch = "A" �̰� �ȵ�
		//char ch = 65 �̰� �����ϰ� ���
		ch = "A".charAt(0); //�Լ�(�޼���)�� ���� ����ȯ(����)
		System.out.println(ch);
		
		char ch2 = '\uac00'; //�����ڵ�(UTF-8) '��'
		int num3 = 'A';
		System.out.println(num3);
		System.out.println(ch2);
		
		float num4 = 10;
		int num5 = (int)1.2f;
		System.out.println(num5); // �Ҽ��� ���ϴ� ���� �ս��� ����
		
		double num6 = 1.0; //double�� �̰� ����
		num6 = 1.0d;
		
		//float num7 = 1.0; �̰� double���̰� float������ �ڵ���ȯ�� �ȵ�
		float num7 = (float)1.0;
		System.out.println(num7);
		
		final int num8 = 5; //���� ���� ��ȣ �� �����Ҷ� ���
		//num8 = 10 error�߻�
	}
}
