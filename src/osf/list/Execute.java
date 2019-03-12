package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.AddressController;
import osf.list.date.AddressData;

public class Execute {
	public static void main(String[] args) {
		AddressController ac = new AddressController();
		Map<String,String> req = new HashMap();
		Map<String,Object> res = new HashMap();
		
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
		req = new HashMap();
		res = new HashMap();
		req.put("cmd", "address");
		req.put("name", "홍길동");
		ac.doGet(req, res);
		System.out.println(res);
		
		req = new HashMap();
		res = new HashMap();
		req.put("cmd", "insert");
		req.put("name", "길동이");
		req.put("phoneNumber", "010-4444-4444");
		req.put("address", "인천시");
		ac.doPost(req,res);
		System.out.println(res);
		System.out.println(AddressData.ADDRESS_LIST);
		
		req = new HashMap();
		res = new HashMap();
		
		req.put("cmd", "addresslist");
		ac.doGet(req, res);
		System.out.println(res);
		
		req = new HashMap();
		res = new HashMap();
		req.put("cmd", "update");
		req.put("name", "홍길동");
		req.put("주소", "홍홍홍");
		ac.doPost(req,res);
		System.out.println(res);
		
		req = new HashMap();
		res = new HashMap();
		req.put("cmd", "delete");
		req.put("name", "홍길동");
		req.put("주소", "홍홍홍");
		ac.doPost(req,res);
		System.out.println(res);
		
	}
}
