package com.ibaset.pattern;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class IbasetApp {
	
	public static void main( String[] args )
    {
        
		
		 String confFile = "ibasetApplicationContext.xml";
	     ConfigurableApplicationContext context = 
	                                new ClassPathXmlApplicationContext(confFile);
	     
	        CustomerDao cusDAO = (CustomerDao) context.getBean("CustomerDAOImpl",CustomerDaoimpl.class);
	        
	        cusDAO.add(10,"abhishek","567836","ib34et@gmail.com",15);
	        
	        System.out.println("Successfully added record");
	        
	        context.close();
	        
    }
}
