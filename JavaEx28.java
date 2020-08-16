package com.javateam.jse;

public class JavaEx28 {
	String name;
	
	public JavaEx28() {
		System.out.println("기본 생성자");
	}
	
	public JavaEx28(String name) {
		this(); //기본 생성자
		//JavaEx28(); 이런식으로 가져오면 (X)
		System.out.println("오버로딩 생성자");
	}
	
	public JavaEx28(String name, int num) {
		this(name); //JavaEx28(String name)
		System.out.println("오버로딩 생성자-2");
	}
	
	public void makeInstance(String name) {
		name = "java"; //여기서의 name은 인자(매개변수)
		this.name = "java"; //여기서의 name은 멤버 필드(맨 위에 있는 String name)
		//this: 자기자신의 객체(인스턴스)
	}
	
	static void staticMethod() {
		//this.name = "java"; 정적 메서드에서는 안됨(x)
	}
	
	static {
		//this.name = "java"; 정적 블럭에서도 안됨(x)
		System.out.println("정적 블럭");
	}
	
	//인스턴스 블럭
	{
		System.out.println("인스턴스 블럭");
	}
	
	public static void main(String[] args) {
		//익명 인스턴스(객체), 일회성
		//주의) 익명 클래스와는 다름!
		new JavaEx28().makeInstance("java"); //기본생성자 부름
		new JavaEx28("자바", 14).makeInstance("java");//오버로딩2 -> 오버로딩1-> 기본생성자 부름
	}

}
