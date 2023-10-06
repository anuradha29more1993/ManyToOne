package com.velocity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.model.Address;
import com.velocity.repository.AddressRepository;
import com.velocity.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	//inject repository
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		Address address1=addressRepository.save(address);
		return address1;
		
	}

}
