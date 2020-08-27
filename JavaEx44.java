package java_20200824_1;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class JavaEx44 {

	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap();
		map.put("신당", "떡볶이");
		map.put("신림", "순대");
		map.put("응암", "감자탕");
		map.put("무교동", "낙지");
		map.put("마장동", "육고기");
		map.put("마포", "갈매기");
		map.put("장충동", "족발");
		map.put("의정부", "부대찌개");
		map.put("노량진", "회");
		
		map.entrySet().forEach(System.out::println);
		map.descendingMap().entrySet().forEach(System.out::println);
		map.descendingKeySet().forEach(System.out::println);
	}

}
