package com.javateam.jse;

public class JavaEx28 {
	String name;
	
	public JavaEx28() {
		System.out.println("�⺻ ������");
	}
	
	public JavaEx28(String name) {
		this(); //�⺻ ������
		//JavaEx28(); �̷������� �������� (X)
		System.out.println("�����ε� ������");
	}
	
	public JavaEx28(String name, int num) {
		this(name); //JavaEx28(String name)
		System.out.println("�����ε� ������-2");
	}
	
	public void makeInstance(String name) {
		name = "java"; //���⼭�� name�� ����(�Ű�����)
		this.name = "java"; //���⼭�� name�� ��� �ʵ�(�� ���� �ִ� String name)
		//this: �ڱ��ڽ��� ��ü(�ν��Ͻ�)
	}
	
	static void staticMethod() {
		//this.name = "java"; ���� �޼��忡���� �ȵ�(x)
	}
	
	static {
		//this.name = "java"; ���� �������� �ȵ�(x)
		System.out.println("���� ��");
	}
	
	//�ν��Ͻ� ��
	{
		System.out.println("�ν��Ͻ� ��");
	}
	
	public static void main(String[] args) {
		//�͸� �ν��Ͻ�(��ü), ��ȸ��
		//����) �͸� Ŭ�����ʹ� �ٸ�!
		new JavaEx28().makeInstance("java"); //�⺻������ �θ�
		new JavaEx28("�ڹ�", 14).makeInstance("java");//�����ε�2 -> �����ε�1-> �⺻������ �θ�
	}

}
