package java_20200811_1;

public class JavaEx25 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i+1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.print("*");
			for(int j = i; j >0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
	}
	}

}
