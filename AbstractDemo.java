abstract class A{
	public abstract int b();
	public void d() {
		System.out.println("world");
	}
}

class B extends A{//반드시 b() 메소드를 가지고 있어야 한다.(오버라이딩)
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		//A obj = new A(); 추상클래스는 반드시 상속해서 써야함
		B obj = new B();
	}

}
