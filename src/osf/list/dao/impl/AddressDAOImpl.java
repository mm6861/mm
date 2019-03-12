package osf.list.dao.impl;

import java.util.List;
import java.util.Map;

import osf.list.dao.AddressDAO;
import osf.list.date.AddressData;

public class AddressDAOImpl implements AddressDAO{

	@Override
	public List<Map<String, String>> selectAddressList() {
		return AddressData.ADDRESS_LIST;
	}

	
	@Override
	public Map<String, String> selectAddress(Map<String, String> address) {
		for(int i=0;i<AddressData.ADDRESS_LIST.size();i++) {
			Map<String,String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("이름").equals(address.get("이름"))) {
				return a;
			}
		}
		return null;
	}

	@Override
	public boolean insertAddress(Map<String, String> address) {
		
		return AddressData.ADDRESS_LIST.add(address);
	}

	@Override
	public String deleteAddress(Map<String, String> address) {
		for(int i=0;i<AddressData.ADDRESS_LIST.size();i++) {
			Map<String,String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("이름").equals(address.get("이름"))) {
				AddressData.ADDRESS_LIST.remove(i);
				return "지웠따!";
			}
		}
		
		return "지우려고하는게없다!";
	}

	@Override
	public boolean updateAddress(Map<String, String> address) {
		for(int i=0;i<AddressData.ADDRESS_LIST.size();i++) {
			Map<String,String> a = AddressData.ADDRESS_LIST.get(i);
			if(a.get("이름").equals(address.get("이름"))) {
				
				if(address.get("주소")!=null) {
					a.put("주소",address.get("주소"));
				}
				if(address.get("전화번호")!=null) {
					a.put("전화번호",address.get("전화번호"));
				}
			}
		}
		return false;
	}


}
