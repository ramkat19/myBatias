package com.te.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.te.customer.domain.AppUser;

@Mapper
public interface ICustomerServices {
	@Select("select * from APPUSERS")
	public List<AppUser> listOfUsers();
}
