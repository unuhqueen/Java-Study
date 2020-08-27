package java_20200825_1;

import java.util.Arrays;
import java.util.List;

public class JavaEx49 {

	public static void main(String[] args) {
		String foods[] = {"����", "�ܹ���", "����", "���뱹", "�Ź�", "���", "����", "������", "������", "���", "����"};
		String fastFood[] = {"����", "ġŲ", "������", "���", "�ֵ���", "����Ƣ��", "�ʰ�", "�ܹ���"};
		
		List<String> foodList = Arrays.asList(foods);
		List<String> fastFoodList = Arrays.asList(fastFood);
		
		foodList.forEach(System.out::println);
		
		System.out.println("---------");
		
		//stream���� ġȯ�ϸ� list�μ��� ������ �Ҿ����, ��� �������� �Լ� ��� ����
		//distinct(): �ߺ� ����
		foodList.stream().distinct().filter(x->!fastFoodList.contains(x)).sorted().limit(2).forEach(System.out::println); 
		
		System.out.println("---------");
	}

}
