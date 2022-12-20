/**
 * 
 */
package com.acheron.mobilestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.acheron.mobilestore.model.Mobile;
import com.acheron.mobilestore.repository.IMobileRepository;

/**
 * @author BhargavRajJinka
 *
 */
@Service
public class MobileServiceImpl implements IMobileService{

	
	private IMobileRepository mobileRepository;
	@Autowired
	/**
	 * @param mobileRepository the mobileRepository to set
	 */
	public void setMobileRepository(IMobileRepository mobileRepository) {
		this.mobileRepository = mobileRepository;
	}

	@Override
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		
		final Sort sort = Sort.by(Direction.DESC, "name");
		return (List<Mobile>) mobileRepository.findAll(sort);
	}

	@Override
	public void addMobile(Mobile mobile) {
		  mobileRepository.save(mobile);
	}

	@Override
	public void updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(int id) {
		// TODO Auto-generated method stub
		
	}

}
