package java_20200812_1;

public class JavaEx26 {

	//��� <= ��� �ʵ� + ��� �޼���
	//�������(�ʵ�: field), �Ӽ�(attribute)
	String name;
	int age;
	float money;
	final double MAX_SIZE = 100; //��� ���(construct)
	
	//��� �޼���(��ü �Լ�)
	//������(������): Ŭ������ ����
	//�� ����: �ν��Ͻ�(������ ��ü) �����ϴ� ����
	//������(��� �ڷ���)�� ���� ����
	public JavaEx26() {
		System.out.println("������(constructor)");
	}
	
	//�Ϲ�(�ν��Ͻ�) ��� �޼���
	public void print(String str) {
		System.out.println(str);
	}
	
	//���� ��� �޼���
	// static(����) Ű����: ���α׷� ����ñ��� �޸𸮿� ����
	// ����, ���� �� => ���� �޸� ���� ����(�޸� ��ũ: memory leak)
	static void staticMethod() {
		System.out.println("���� ��� �޼���");
	}
	
	//���� �޼���
	public static void main(String[] args) {
		String name; //��������
		
		//��ü(�ν��Ͻ�, ��ü����) ����
		//Ŭ���� �ν��Ͻ�(��ü ����)
		//=����(�޸𸮿� �ִ� ����) ���� ���� ������(new) ������ �޼���
		//�ν��Ͻ�(��ü ����) => ���� �޸�(heap�� �ڱ�޸� �ּ�)
		//���� �ν��Ͻ��� ������ => heap �޸�
		JavaEx26 obj = new JavaEx26();
		obj.age = 20; //��� �ʵ忡 ���� ����
		obj.name = "ȫ�浿";
		obj.print(obj.name); //��� �޼��� ȣ��
		
		staticMethod(); //(O)
		//obj.staticMethod(); (O, �׷��� ���� ���� ����� �ƴ�)
	}

}
