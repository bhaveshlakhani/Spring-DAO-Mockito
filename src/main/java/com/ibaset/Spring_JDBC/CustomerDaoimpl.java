package com.ibaset.Spring_JDBC;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoimpl implements CustomerDao {
	
	DataSource datasource;
	JdbcTemplate jdbcTemplate;
	
	public CustomerDaoimpl(DataSource datasource) {
		
		this.datasource=datasource;
		
	}

	public int save(Customer customer) 
	{
		
		String query = "insert into Customer values(?,?,?,?,?)";
        jdbcTemplate = new JdbcTemplate(datasource);
        
        Object[] inputs = new Object[] {customer.getId(),customer.getName(),customer.getMobile(),customer.getEmail(),customer.getLocation_id()};
        
        int rowsaffetcted=  jdbcTemplate.update(query,inputs);
        
        System.out.println(rowsaffetcted);
		
		return rowsaffetcted;
		
	}

}
