package com.ibaset.Spring_JDBC;

public interface CustomerDao {
	
	public void add(int id,String name,String mobile,String email,int location_id);
	
	public void add(Customer customer);

}
