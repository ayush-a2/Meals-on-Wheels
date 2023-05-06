package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.exception.LoginException;
import com.masai.model.Customer;
import com.masai.model.Login;

public interface AdminService {

	public String deleteAccounts(Login loginDTO) throws LoginException;
	
	public List<Customer> showToBeDeletedAccounts(Login loginDTO) throws CustomerException, LoginException;
}
