package java_20200824_1;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class JavaEx46 {

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
		
		map.headMap("���嵿", true).entrySet().forEach(System.out::println);
		map.tailMap("���嵿", true).entrySet().forEach(System.out::println);
		map.subMap("�Ŵ絿", true, "������", false).entrySet().forEach(System.out::println);
		
		
	}

}
