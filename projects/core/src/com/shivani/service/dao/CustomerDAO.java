package com.shivani.service.dao;

import com.shivani.service.dobj.Customer;

public interface CustomerDAO {

	public boolean addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Customer customer);
	public void getCustomers();
	public void getCustomerById(String customerId);
	public void getCustomerListByName(String customerName);
	public void getCustomerListByAddress(String customerAddress);
	
	
}
