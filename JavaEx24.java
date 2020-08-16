package java_20200811_1;

public class JavaEx24 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i+1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
	}
	}

}
