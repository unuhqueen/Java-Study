abstract class A{
	public abstract int b();
	public void d() {
		System.out.println("world");
	}
}

class B extends A{//�ݵ�� b() �޼ҵ带 ������ �־�� �Ѵ�.(�������̵�)
	public int b() {
		return 1;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		//A obj = new A(); �߻�Ŭ������ �ݵ�� ����ؼ� �����
		B obj = new B();
	}

}
