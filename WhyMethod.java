import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
									//�Ű�����, parameter
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out="";
		out = out+delimiter+"\n";
		out = out+text+"\n";
		out = out+text+"\n";
		return out;
	}
	
	public static void main(String[] args) throws IOException{
					//����, argument
		printTwoTimes("A", "-");
		printTwoTimes("A", "*");
		printTwoTimes("A", "&");
		System.out.println(twoTimes("-", "A"));
		
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
	}

}
