package com.shivani.service.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.NamingException;

import com.shivani.service.db.connection.ConnectionPooling;
import com.shivani.service.dobj.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		String sqlInert = "insert into customer values(?,?,?)";
		Connection con=null;
		PreparedStatement stmt;
		boolean response=false;
		
		try {
			 con = ConnectionPooling.getDBConnectionLocal();
			 stmt = con.prepareStatement(sqlInert);
			 stmt.setString(1, customer.getCustomerId());
			 stmt.setString(2, customer.getCustomerName());
			 stmt.setString(3, customer.getCustomerAddress());
			 stmt.executeUpdate();
             if(stmt.executeUpdate()==1)
			 {System.out.println("Record inserted");
			 response=true;
			 }
			 if(stmt.executeUpdate()!=1)
			 {
				 System.out.println("Record  not inserted");
			  response=false;
			 }
			 
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
		
		
		
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
