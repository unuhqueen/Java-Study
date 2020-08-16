package com.javateam.jse;

public class JavaEx29 {

	public static void main(String[] args) {
		String twice[] = new String[9];
		//이상태에선 기본값 null, int일 경우 기본값 0
		twice[0] = "나연";
		twice[1] = "정연";
		twice[2] = "모모";
		twice[3] = "사나";
		twice[4] = "지효";
		twice[5] = "채연";
		twice[6] = "쯔위";
		twice[7] = "미나";
		twice[8] = "다현";
		
		System.out.println(twice[2]);
		
		System.out.println("------------");
		
		for(int i = 0; i < twice.length; i++) {
			System.out.println(twice[i]);
		}
		
		System.out.println("------------");
		
		//foreach문: "다음(next)" 요소 검색하는 방식
		//연번(index) 검색 방식(x) -> 다량시 성능 향상!
		for(String s : twice) {
			System.out.println(s);
		}
		
		String [] twice2 = new String[]{"나연", "정연", "다현", "지효", "쯔위", "채영","모모","미나","사나"};
		//new String[] 없어도 됨, [] 안에 숫자 들어가면 error
		for(int i = 0; i<twice2.length; i++) {
			System.out.println(twice2[i]);
		}
	}

}
