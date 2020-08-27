package java_20200824_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaEx43 {

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>(); //�ٷ� ���ĵǴ� set
		set.add("���빮");
		set.add("��ȭ��");
		set.add("������");
		set.add("���ҹ�");
		set.add("���빮");
		set.add("�溹��");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--------------");
		
		set.descendingSet().forEach(System.out::println);
		
		System.out.println("--------------");
		
		Iterator<String> it1 = set.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("--------------");
		
		System.out.println(set.first()); //ó�� ���� ������
		System.out.println(set.last());
		
		System.out.println("--------------");
		
		set.headSet("��ȭ��").forEach(System.out::println);; //��ȭ�� ���� �͵��� ������
		
		System.out.println("--------------");
		
		set.headSet("������", true).forEach(System.out::println); //������ ���� ���� �͵��� ������
		
		System.out.println("--------------");
		
		set.subSet("��ȭ��", true, "â���", false).forEach(System.out::println);
		
		System.out.println("--------------");
		
		set.tailSet("���빮", false).forEach(System.out::println);
	}
	
	

}
