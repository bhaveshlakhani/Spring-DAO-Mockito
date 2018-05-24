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
	        
	        cusDAO.add(5,"vivek","567836","ibaset@gmail.com",10);
	        
	        System.out.println("Successfully added record");
	        
	        context.close();
	        
   
    }
}
