package com.acheron.mobilestore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acheron.mobilestore.model.Mobile;
import com.acheron.mobilestore.service.IMobileService;

@RestController
@RequestMapping("mobile-api")
public class MobileController {

	private IMobileService mobileService;
	
	@Autowired
	/**
	 * @param mobileservice the mobileservice to set
	 */
	public void setMobileservice(IMobileService mobileService) {
		this.mobileService = mobileService;
	}

	@GetMapping("/mobiles")
	ResponseEntity<List<Mobile>> getAll(){
		return ResponseEntity.ok().body(mobileService.getAll());
	}
	
}
