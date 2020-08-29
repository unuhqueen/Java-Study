import java.io.*;

class B{
	void run() throws FileNotFoundException, IOException{
		BufferedReader bReader = null;
		//try 중괄호 안에 있으면 지역변수라서 밑에 코드 실행이 안됨
		String input = null;
		
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		
		System.out.println(input);
	}
}

class C{
	void run() throws FileNotFoundException, IOException{
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e){
			System.out.println("out.txt 파일이 필요합니다");
		}catch (IOException e) {
			//FileNotFoundException은 IOException에 상속되어 있으므로 이것만 써도됨
			e.printStackTrace();
		}
	}

}
