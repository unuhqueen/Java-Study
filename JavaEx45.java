package java_20200824_1;

import java.util.HashMap;
import java.util.Map;

public class JavaEx45 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("신당", "떡볶이");
		map.put("신림", "순대");
		map.put("응암", "감자탕");
		map.put("무교동", "낙지");
		map.put("마장동", "육고기");
		map.put("마포", "갈매기");
		map.put("장충동", "족발");
		map.put("의정부", "부대찌개");
		map.put("노량진", "회");
		
		map.forEach((k, v)->System.out.println(k+"="+v));
		
		System.out.println("--------------");
		
		map.entrySet().forEach(e->System.out.println(e)); //System.out::println와 동치
		
		System.out.println("--------------");
		
		map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		
		
	}

}
