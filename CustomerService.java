package com.niit.training.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.training.dao.Customer;

@Service
public interface CustomerService {

	List<Customer> customer = new ArrayList<Customer>();
	
	

	void addCustomer(String email_id, String password, String firstName, String middleName, String lastName,
			long contact);



	boolean findCustomer(String email_id);



	Customer findCustomerObj(String email_id);
	}

