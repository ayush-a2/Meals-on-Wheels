package com.masai.service;

import java.util.List;

import com.masai.exception.CustomerException;
import com.masai.exception.LoginException;
import com.masai.model.Customer;


public interface AdminService {

	public String deleteAccounts(LoginDTOO loginDTO) throws LoginException;
	
	public List<Customer> showToBeDeletedAccounts(LoginDTOO loginDTO) throws CustomerException, LoginException;
}
