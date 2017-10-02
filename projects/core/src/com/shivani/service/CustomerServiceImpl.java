package com.shivani.service;

import java.io.Serializable;

import com.shivani.service.dobj.Customer;
import com.shivani.service.open.CustomerService;

public class CustomerServiceImpl implements CustomerService,Serializable{

	@Override
	public void addCustomer(Customer customer) {
		System.out.println("Data to be saved:  "+customer);
		
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerListByName(String customerName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getCustomerListByAddress(String customerAddress) {
		// TODO Auto-generated method stub
		
	}

}
