package java_20200824_1;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class JavaEx44 {

	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap();
		map.put("�Ŵ�", "������");
		map.put("�Ÿ�", "����");
		map.put("����", "������");
		map.put("������", "����");
		map.put("���嵿", "�����");
		map.put("����", "���ű�");
		map.put("���浿", "����");
		map.put("������", "�δ��");
		map.put("�뷮��", "ȸ");
		
		map.entrySet().forEach(System.out::println);
		map.descendingMap().entrySet().forEach(System.out::println);
		map.descendingKeySet().forEach(System.out::println);
	}

}
