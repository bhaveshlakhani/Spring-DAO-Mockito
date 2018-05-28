package com.ibaset.pattern;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerDaoimpl implements CustomerDao {
	
	DataSource datasource;
	
	JdbcTemplate jdbcTemplate;
	
	public CustomerDaoimpl(DataSource datasource) 
	{
		
		this.datasource=datasource;
		
	}

	public void add(int id, String name, String mobile, String email, int location_id) {
		
		
		String query = "insert into Customer values(?,?,?,?,?)";
		
        jdbcTemplate = new JdbcTemplate(datasource);
        
        jdbcTemplate.update(query, id,name,mobile,email,location_id);
        
        
        System.out.println(  jdbcTemplate.getDataSource());
      
        
	}

}
