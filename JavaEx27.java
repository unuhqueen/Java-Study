package com.javateam.jse;

//class JavaEx27(O)
//private class JavaEx27(X)
//protected class JavaEx27(X)
public class JavaEx27 {

	public String name;
	//아예 안 붙이는거 => default
	//private => 한 클래스에서만 접근 허용
	//public => 가장 개방적
	
	public static void main(String[] args) {
		JavaEx27 obj;
		obj = new JavaEx27();
		
		obj.name = "java";
		System.out.println(obj.name);
	}

}
