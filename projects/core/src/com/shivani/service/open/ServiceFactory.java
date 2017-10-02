package com.shivani.service.open;

import com.shivani.service.CustomerServiceImpl;

public class ServiceFactory {
	
	public static CustomerService customerService = new CustomerServiceImpl();

}
