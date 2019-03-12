package osf.list.controller;

import java.util.HashMap;
import java.util.Map;

import osf.list.service.AddressService;
import osf.list.service.impl.AddressServiceImpl;

public class AddressController {
	private AddressService as = new AddressServiceImpl();
	
	public void doGet(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		Map<String,String> address = new HashMap<>();
		address.put("이름", name);
		if("addresslist".equals(cmd)) {
			res.put("addresslist", as.selectAddressList());
		}else if("address".equals(cmd)) {
			res.put("address",as.selectAddress(address));
		}
	}
	public void doPost(Map<String,String> req, Map<String,Object> res) {
		String cmd = req.get("cmd");
		String name = req.get("name");
		String addr = req.get("address");
		String phoneNumber = req.get("phoneNumber");
		Map<String,String> address = new HashMap<>();
		address.put("이름", name );
		address.put("주소", addr);
		address.put("전화번호", phoneNumber);
		if("insert".equals(cmd)) {
			res.put("insert",as.insertAddress(address));
		}else if("update".equals(cmd)) {
			res.put("update",as.updateAddress(address));
		}else if("delete".equals(cmd)) {
			res.put("delete",as.deleteAddress(address));
		}
	}
}
