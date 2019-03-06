package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {


	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<>();
//		list.add("홍길동");
//		list.add("44");
//		list.add("서울시");
//		
//		List<String> list1 = new ArrayList<>();
//		list1.add("박길동");
//		list1.add("33");
//		list1.add("인천시");
//		
//		List<String> list2 = new ArrayList<>();
//		list2.add("최길동");
//		list2.add("22");
//		list2.add("광주시");
//		
//		List<List<String>> bigList = new ArrayList<>();
//		bigList.add(list);
//		bigList.add(list1);
//		bigList.add(list2);
//		
//		System.out.println(bigList);
//		System.out.println(bigList.get(0));
//		System.out.println(bigList.get(0).get(1));

		Map<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","44");
		map.put("주소","서울시");
		//------------------------------
		Map<String,String> map3 = new HashMap<>();
		map3.put("서울","강동구");
		Map<String,String> map4 = new HashMap<>();
		map4.put("인천","부평구");
		Map<String,String> map5 = new HashMap<>();
		map5.put("광주","서구");
		//-----------------------------------------
		Map<String,String> map1 = new HashMap<>();
		map1.put("이름","홍길동");
		map1.put("나이","33");
		map1.put("주소","인천시");
		
		Map<String,String> map2 = new HashMap<>();
		map2.put("이름","홍길동");
		map2.put("나이","22");
		map2.put("주소","광주시");
//		
//		List<Map<String,String>> mapList = new ArrayList<>();
//		mapList.add(map);
//		mapList.add(map1);
//		mapList.add(map2);
//		
//		List<Map<String,String>> mapList1 = new ArrayList<>();
//		mapList.add(map);
//		mapList.add(map1);
//		mapList.add(map2);
//		
//		System.out.println(mapList);
//		System.out.println(mapList.get(0));
//		System.out.println(mapList.get(0).get("나이"));
		
		System.out.println(map3);
		Map<Map<String,String>,Map<String,String>> mmapList = new HashMap<>();
		mmapList.put(map, map3);
		mmapList.put(map1, map4);
		mmapList.put(map2, map5);
		System.out.println(mmapList);
//		System.out.println(mmapList.get(map));
//		System.out.println(mmapList.get("서울시").get("서울"));
		
	
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("a");
		strList.add("a");
		strList.add("a");
		System.out.println(strList.get(0)==strList.get(2));
		//리스트는 중복가능!!! 
		
		Map<String,String> map10 = new HashMap<>();
		//애초에 키는 중복이 안되 
		map10.put("이름","김길동");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}
}
 