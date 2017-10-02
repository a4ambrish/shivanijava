package com.shivani.service.dobj;

import java.io.Serializable;

/**
 * Customer class to hold basi customer information
 * 
 * @version 1.0
 * */
public class Customer implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String customerId;
	private String customerName;
	private String customerAddress;
	
	/**
	 * get customer id.
	 * */
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + "]";
	}
	
	
	
	
}
