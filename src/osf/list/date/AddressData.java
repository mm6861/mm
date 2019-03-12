package osf.list.date;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressData {
	public static final List<Map<String,String>> ADDRESS_LIST = new ArrayList<>();
	static {
		Map<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("주소","장성시");
		map.put("전화번호","010-1111-1111");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름","박머시기");
		map.put("주소","서울시");
		map.put("전화번호","010-2222-2222");
		ADDRESS_LIST.add(map);
		
		map = new HashMap<>();
		map.put("이름","김머시기");
		map.put("주소","광주시");
		map.put("전화번호","010-3333-3333");
		ADDRESS_LIST.add(map);
	}
}
