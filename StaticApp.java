class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);
		//System.out.println(instanceVar); ���ٺҰ�
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
		//System.out.println(Foo.instanceVar); Ŭ������ ���� ���� �Ұ�
		Foo.classMethod();
		//Foo.instanceMethod(); instance �Ҽ��̹Ƿ� Ŭ������ ���� ���� �Ұ�
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); //������ �״�� ���
		System.out.println(f1.instanceVar); //������ �״�� ���
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //�ٲﰪ ���
		//�ν��Ͻ��� ����� Ŭ�������� ���� �ٲ�
		System.out.println(f2.classVar); //�ٲﰪ ���
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); //�ٲﰪ ���
		System.out.println(f2.instanceVar); //������ �״�� ���
		//f1 �ν��Ͻ����� ���� �ٲ�
	}

}
