package java_20200825_1;

public class JavaEx48 {
	static class StaticClass {
		
	}
	
	void innerMethod() {
		
		//���� Ŭ����
		class LocalClass {
			String name;
			LocalClass() {}
			void print() {}
		}
	}
	
	public static void main(String[] args) {
		JavaEx48.StaticClass staticClass = new StaticClass();
		StaticClass staticClass2 = new StaticClass();
		
		//�͸� �ν��Ͻ�: new JavaEx48()
		//��ȸ��
		new JavaEx48().innerMethod();
	}

}
