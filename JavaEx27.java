package com.javateam.jse;

//class JavaEx27(O)
//private class JavaEx27(X)
//protected class JavaEx27(X)
public class JavaEx27 {

	public String name;
	//�ƿ� �� ���̴°� => default
	//private => �� Ŭ���������� ���� ���
	//public => ���� ������
	
	public static void main(String[] args) {
		JavaEx27 obj;
		obj = new JavaEx27();
		
		obj.name = "java";
		System.out.println(obj.name);
	}

}
