package com.velocity.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.model.Address;
import com.velocity.model.Employee;
import com.velocity.service.AddressService;
import com.velocity.service.EmployeeService;

@RestController
public class EmployeeAddressRestController {
	//inject 
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/saveEmployeeAddress")
	public Address saveAddress(@RequestBody Address address) {
		Address address1=addressService.saveAddress(address);
		List<Employee> employee=address.getEmployeeList();
		for(Employee e:employee) {
			e.setAddressId(address.getId());
			employeeService.saveEmployee(e);
		}
		return address1;
		
	}
	
	

}
