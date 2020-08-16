package java_20200812_1;

public class Member {
	
	String name;
	
	//기본 생성자는 오버로딩 생성자 없이 단독으로 사용할 경우 묵시적으로 생성된다.
	public Member() {
		System.out.println("기본 생성자");
	}
	
	//오버로딩 생성자
	public Member(String Str) {
		this(); //Member()
	}
	
	public Member(String Str, String Str1) {
		this(Str); //Member(String Str)
	}
	
	public Member(int num, long num1) {
		
	}
	
	//일반 멤버 메서드 오버로딩
	public void print() {
		System.out.println("print");
	}
	
	public void print(String str) {
		System.out.println("print");
	}
	
	//오버로딩: 함수 인자(매개변수)의 인자 수/종류/순서에 변화를 줘서 같은 이름의 메서드를 다양하게 작성, 활용
	//인자의 이름과는 무관

	public static void main(String[] args) {
		Member member = new Member(); //멤버 메서드가 없는데 변수 생성 가능
		Member member2 = new Member("홍길동");
		Member member3 = new Member("홍길동", "왕");
		Member member4 = new Member(3000, 4000L);
		member.name = "홍길동";
		System.out.println(member.name);
	}

}
