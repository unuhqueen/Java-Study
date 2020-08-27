package java_20200824_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx42 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("³²´ë¹®");
		set.add("±¤È­¹®");
		set.add("´ö¼ö±Ã");
		set.add("µ¿¼Ò¹®");
		set.add("µ¿´ë¹®");
		set.add("°æº¹±Ã");
		set.add("Ã¢°æ±Ã");
		
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
