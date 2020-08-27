package java_20200824_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx42 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("���빮");
		set.add("��ȭ��");
		set.add("������");
		set.add("���ҹ�");
		set.add("���빮");
		set.add("�溹��");
		set.add("â���");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("-----------");
		
		for (String s: set) {
			System.out.println(s);
		}
		
		System.out.println("-----------");
		
		set.forEach(System.out::println);
		
		System.out.println("-----------");
		
		set.stream().sorted().forEach(System.out::println);
		
		
	}
	
	

}
