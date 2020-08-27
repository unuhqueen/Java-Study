package java_20200825_1;

public class JavaEx48 {
	static class StaticClass {
		
	}
	
	void innerMethod() {
		
		//지역 클래스
		class LocalClass {
			String name;
			LocalClass() {}
			void print() {}
		}
	}
	
	public static void main(String[] args) {
		JavaEx48.StaticClass staticClass = new StaticClass();
		StaticClass staticClass2 = new StaticClass();
		
		//익명 인스턴스: new JavaEx48()
		//일회성
		new JavaEx48().innerMethod();
	}

}
