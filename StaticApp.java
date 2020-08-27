class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);
		//System.out.println(instanceVar); 접근불가
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		//System.out.println(Foo.instanceVar); 클래스를 통해 접근 불가
		Foo.classMethod();
		//Foo.instanceMethod(); instance 소속이므로 클래스를 통해 접근 불가
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); //원래값 그대로 출력
		System.out.println(f1.instanceVar); //원래값 그대로 출력
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //바뀐값 출력
		//인스턴스에 연결된 클래스변수 값도 바뀜
		System.out.println(f2.classVar); //바뀐값 출력
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); //바뀐값 출력
		System.out.println(f2.instanceVar); //원래값 그대로 출력
		//f1 인스턴스변수 값만 바뀜
	}

}
