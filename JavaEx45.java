package java_20200824_1;

import java.util.HashMap;
import java.util.Map;

public class JavaEx45 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("�Ŵ�", "������");
		map.put("�Ÿ�", "����");
		map.put("����", "������");
		map.put("������", "����");
		map.put("���嵿", "�����");
		map.put("����", "���ű�");
		map.put("���浿", "����");
		map.put("������", "�δ��");
		map.put("�뷮��", "ȸ");
		
		map.forEach((k, v)->System.out.println(k+"="+v));
		
		System.out.println("--------------");
		
		map.entrySet().forEach(e->System.out.println(e)); //System.out::println�� ��ġ
		
		System.out.println("--------------");
		
		map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		
		
	}

}
