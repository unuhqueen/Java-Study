package java_20200821_1;

interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}

class RealCal implements Calculable, Printable{

	public int sum(int v1, int v2) {
		// TODO Auto-generated method stub
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}

class AdvancedPrint implements Printable{
	public void print() {
		System.out.println("This is RealCal!!");
	}
}
public class InterfaceApp {

	public static void main(String[] args) {
		//더하기 기능이 있는 클래스를 만들어주세요.
		Printable c = new AdvancedPrint();
		c.print();
	}

}
