package com.acheron.mobilestore.service;

import java.util.List;

import com.acheron.mobilestore.model.Mobile;

public interface IMobileService {

	List<Mobile> getAll();
	void addMobile(Mobile mobile);
	void updateMobile(Mobile mobile);
	void deleteMobile(int id);

}
