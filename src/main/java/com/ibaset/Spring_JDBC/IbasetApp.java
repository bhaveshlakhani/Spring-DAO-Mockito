package com.ibaset.Spring_JDBC;

import java.sql.SQLException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.mysql.jdbc.Driver;

/**
 * Hello world!
 *
 */
public class IbasetApp {
	
	public static void main( String[] args )
    {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	        ICustomer customer;
	        
	        customer=context.getBean("custimpl", ICustomerImpl.class);
	        
	        try 
	        {
				customer.add(12,"bhavesh","8866766995", "bhavesh@gmail.com", 10);
			}
	        
	        catch (Invalidmobilenumber e)
	        {
				e.printStackTrace();
			}
	        
	        System.out.println("Successfully added");
	      
	        context.close();
    }
}
