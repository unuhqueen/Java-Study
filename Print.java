
public class Print {
		public String delimiter = "";
		public Print(String delimiter) {
			this.delimiter = delimiter;
			//this: 클래스가 인스턴스화 되었을때 인스턴스 변수를 의미
		}
		public void A() {
			System.out.println(this.delimiter);
			System.out.println("A");
			System.out.println("A");
		}
		
		public void B() {
			System.out.println(this.delimiter);
			System.out.println("B");
			System.out.println("B");
		}
	}
