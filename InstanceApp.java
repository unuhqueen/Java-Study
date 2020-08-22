import java.io.FileNotFoundException;
import java.io.PrintWriter; //패키지

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		//PrintWriter라는 class의 복제본을 변수 p1(instance)에 저장
		//데이터타입으로 PrintWriter를 지정해줌
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
	}

}
