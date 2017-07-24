package com.niit.training.services;

import java.awt.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.training.dao.Customer;
import com.niit.training.dao.CustomerDao;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	
	

		@Autowired
		 CustomerDao customerDao;
	    @Transactional
		@Override
		public void addCustomer(final String email_id,final String password,final String firstName,final String middleName,final String lastName,final
				long contact) {
			customerDao.add(new Customer(email_id,password, firstName,middleName,lastName,contact));
		}
	    
		@Override
		public boolean findCustomer(String email_id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Customer findCustomerObj(String email_id) {
			// TODO Auto-generated method stub
			return null;
		}
		

		

}
