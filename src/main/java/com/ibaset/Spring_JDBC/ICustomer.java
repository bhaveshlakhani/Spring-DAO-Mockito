package com.ibaset.Spring_JDBC;

public interface ICustomer {

	public void add(int id,String name,String mobile,String email,int location_id) throws Invalidmobilenumber;

}
