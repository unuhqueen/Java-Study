package java_20200812_1;

public class Member {
	
	String name;
	
	//�⺻ �����ڴ� �����ε� ������ ���� �ܵ����� ����� ��� ���������� �����ȴ�.
	public Member() {
		System.out.println("�⺻ ������");
	}
	
	//�����ε� ������
	public Member(String Str) {
		this(); //Member()
	}
	
	public Member(String Str, String Str1) {
		this(Str); //Member(String Str)
	}
	
	public Member(int num, long num1) {
		
	}
	
	//�Ϲ� ��� �޼��� �����ε�
	public void print() {
		System.out.println("print");
	}
	
	public void print(String str) {
		System.out.println("print");
	}
	
	//�����ε�: �Լ� ����(�Ű�����)�� ���� ��/����/������ ��ȭ�� �༭ ���� �̸��� �޼��带 �پ��ϰ� �ۼ�, Ȱ��
	//������ �̸����� ����

	public static void main(String[] args) {
		Member member = new Member(); //��� �޼��尡 ���µ� ���� ���� ����
		Member member2 = new Member("ȫ�浿");
		Member member3 = new Member("ȫ�浿", "��");
		Member member4 = new Member(3000, 4000L);
		member.name = "ȫ�浿";
		System.out.println(member.name);
	}

}
