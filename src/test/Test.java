package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		
////		Map<String,String> map = new HashMap<>();
////		map.put("이름","홍길동");
////		map.put("나이","33");
////		map.put("주소","서울시");
//		
//		Map<Integer,String> map = new HashMap<>();
//		map.put(1,"홍길동");
//		map.put(2,"33");
//		map.put(3,"서울시");
//		
//		Iterator<Integer> it = map.keySet().iterator();
//		
//		while(it.hasNext() ) {
//			Integer key = it.next();
//			System.out.println("key : " + key);
//			System.out.println("value : " + map.get(key));
//		}
		
		char[] abc = {'a','b','c','d'};
		char[] tmp = {'1','2','3','4','5','6','7','8','9'};
//		System.arraycopy(abc, 0, tmp, 0, abc.length);
		System.arraycopy(abc, 0, tmp, 3, abc.length);
		for(int i=0; i<tmp.length;i++) {
			System.out.println(tmp[i]);
			
		}
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
}
