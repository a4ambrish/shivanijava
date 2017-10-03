package com.shivani.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.shivani.service.dobj.Customer;

@Path("/customer")
public class CustomerService {

	
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@POST
	public String addCustomer(Customer customer){
		
		// save this record into database
		
		return "ok"+customer.toString();
	}
	
}
