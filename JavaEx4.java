package com.javateam.jse;

public class JavaEx4 {
	public static void main(String[] args) {
		byte num = 1;
		num = (byte)200; //200은 byte 범위 넘음 -> 형변환(type conversion, casting)
		System.out.println(num); //범주 안에는 들어가지만 엉뚱한 값 -56이 나옴
		// 자료형의 범위에서 벗어난 값의 형변환에서는 값의 손실이 발생!
		
		int num1 = 120;
		num = (byte)num1;
		System.out.println(num);
		// 큰 자료형의 변수(값) -> 작은 자료형의 변수(값)
		// 강제(수동) 형변환!
		
		int num2 = num; //작은->큰: 자동변환
		
		char ch = 'A';
		//char ch = "A" 이건 안됨
		//char ch = 65 이건 동일하게 출력
		ch = "A".charAt(0); //함수(메서드)에 의한 형변환(추출)
		System.out.println(ch);
		
		char ch2 = '\uac00'; //유니코드(UTF-8) '가'
		int num3 = 'A';
		System.out.println(num3);
		System.out.println(ch2);
		
		float num4 = 10;
		int num5 = (int)1.2f;
		System.out.println(num5); // 소수점 이하는 값의 손실이 있음
		
		double num6 = 1.0; //double은 이게 가능
		num6 = 1.0d;
		
		//float num7 = 1.0; 이건 double형이고 float형으로 자동변환이 안됨
		float num7 = (float)1.0;
		System.out.println(num7);
		
		final int num8 = 5; //기존 값을 보호 및 은닉할때 사용
		//num8 = 10 error발생
	}
}
