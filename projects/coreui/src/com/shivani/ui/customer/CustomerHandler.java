package com.shivani.ui.customer;


import com.shivani.service.dobj.Customer; // OK
import com.shivani.service.open.CustomerService; // OK
import com.shivani.service.open.ServiceFactory;

public class CustomerHandler {

	public static void main(String[] args) {
		Customer customer = new Customer();
		CustomerService customerService = ServiceFactory.customerService;
		CustomerService customerService2 = ServiceFactory.customerService;
		System.out.println(customerService);
		System.out.println(customerService2);
		customer.setCustomerAddress("Nangloi");
		customer.setCustomerId("1");
		customer.setCustomerName("Ambrish");
		
		customerService.addCustomer(customer);
		
	
		
		
		
	}
	
}
