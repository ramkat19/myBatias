package com.te.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.te.customer.dao.ICustomerServices;
import com.te.customer.domain.AppUser;
@RestController
public class CustomerController implements ICustomerController {
	@Autowired
	ICustomerServices iCustomerServices;

	public List<AppUser> getUsers() {		
		return iCustomerServices.listOfUsers();
	}

}
