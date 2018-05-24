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
        
		
		 String confFile = "applicationContext.xml";
	     ConfigurableApplicationContext context = 
	                                new ClassPathXmlApplicationContext(confFile);
	        CustomerDao cusDAO = (CustomerDao) context.getBean("CustomerDAOImpl");
	        
	      //  cusDAO.add(1,"abhi","88995","Abhi@gmail.com",10);
	        
	        Customer c1=new Customer();
	        
	        c1.setId(2);
	        c1.setName("Abhishek");
	        c1.setMobile(84876785);
	        c1.setEmail("bahvesh@gmail.com");
	        c1.setLocation_id(121);
	      
	        cusDAO.add(c1);
	        
	        System.out.println("Successfully added");
	        
	        context.close();
	        
   
    }
}
