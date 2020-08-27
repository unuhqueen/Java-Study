package java_20200825_1;

import java.util.Arrays;
import java.util.List;

public class JavaEx49 {

	public static void main(String[] args) {
		String foods[] = {"ÇÇÀÚ", "ÇÜ¹ö°Å", "Á¤½Ä", "¼ø´ë±¹", "ÄÅ¹ä", "±è¹ä", "°õÅÁ", "¶±ººÀÌ", "¶±ººÀÌ", "±è¹ä", "°õÅÁ"};
		String fastFood[] = {"ÇÇÀÚ", "Ä¡Å²", "¶±ººÀÌ", "±è¹ä", "ÇÖµµ±×", "°¨ÀÚÆ¢±è", "³Ê°Ù", "ÇÜ¹ö°Å"};
		
		List<String> foodList = Arrays.asList(foods);
		List<String> fastFoodList = Arrays.asList(fastFood);
		
		foodList.forEach(System.out::println);
		
		System.out.println("---------");
		
		//streamÀ¸·Î Ä¡È¯ÇÏ¸é list·Î¼­ÀÇ ¹°¼ºÀ» ÀÒ¾î¹ö¸², ´ë½Å ¿©·¯°¡Áö ÇÔ¼ö »ç¿ë °¡´É
		//distinct(): Áßº¹ »èÁ¦
		foodList.stream().distinct().filter(x->!fastFoodList.contains(x)).sorted().limit(2).forEach(System.out::println); 
		
		System.out.println("---------");
	}

}
