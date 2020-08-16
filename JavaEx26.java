package java_20200812_1;

public class JavaEx26 {

	//멤버 <= 멤버 필드 + 멤버 메서드
	//멤버변수(필드: field), 속성(attribute)
	String name;
	int age;
	float money;
	final double MAX_SIZE = 100; //멤버 상수(construct)
	
	//멤버 메서드(객체 함수)
	//생성자(구축자): 클래스와 동명
	//모성 역할: 인스턴스(협의의 객체) 생성하는 역할
	//리턴형(결과 자료형)을 적지 않음
	public JavaEx26() {
		System.out.println("생성자(constructor)");
	}
	
	//일반(인스턴스) 멤버 메서드
	public void print(String str) {
		System.out.println(str);
	}
	
	//정적 멤버 메서드
	// static(정적) 키워드: 프로그램 종료시까지 메모리에 상주
	// 과용, 남용 시 => 가용 메모리 부족 현상(메모리 리크: memory leak)
	static void staticMethod() {
		System.out.println("정적 멤버 메서드");
	}
	
	//메인 메서드
	public static void main(String[] args) {
		String name; //지역변수
		
		//객체(인스턴스, 객체변수) 생성
		//클래스 인스턴스(객체 변수)
		//=동적(메모리에 있다 없다) 변수 생성 연산자(new) 생성자 메서드
		//인스턴스(객체 변수) => 스택 메모리(heap의 자기메모리 주소)
		//실제 인스턴스의 데이터 => heap 메모리
		JavaEx26 obj = new JavaEx26();
		obj.age = 20; //멤버 필드에 값을 대입
		obj.name = "홍길동";
		obj.print(obj.name); //멤버 메서드 호출
		
		staticMethod(); //(O)
		//obj.staticMethod(); (O, 그러나 정적 접근 방법은 아님)
	}

}
