package com.te.customer.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.te.customer.domain.AppUser;

public interface ICustomerController {
    @RequestMapping("/users")
	public List<AppUser> getUsers();
}
