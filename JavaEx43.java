package java_20200824_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaEx43 {

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>(); //¹Ù·Î Á¤·ÄµÇ´Â set
		set.add("³²´ë¹®");
		set.add("±¤È­¹®");
		set.add("´ö¼ö±Ã");
		set.add("µ¿¼Ò¹®");
		set.add("µ¿´ë¹®");
		set.add("°æº¹±Ã");
		
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
		
		System.out.println(set.first()); //Ã³À½ °ÍÀ» °¡Á®¿È
		System.out.println(set.last());
		
		System.out.println("--------------");
		
		set.headSet("µ·È­¹®").forEach(System.out::println);; //µ·È­¹® ¾ÕÀÇ °ÍµéÀ» °¡Á®¿È
		
		System.out.println("--------------");
		
		set.headSet("´ö¼ö±Ã", true).forEach(System.out::println); //´ö¼ö±Ã Æ÷ÇÔ ¾ÕÀÇ °ÍµéÀ» °¡Á®¿È
		
		System.out.println("--------------");
		
		set.subSet("µ·È­¹®", true, "Ã¢°æ±Ã", false).forEach(System.out::println);
		
		System.out.println("--------------");
		
		set.tailSet("³²´ë¹®", false).forEach(System.out::println);
	}
	
	

}
