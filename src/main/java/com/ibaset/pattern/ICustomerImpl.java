package com.ibaset.pattern;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ICustomerImpl implements ICustomerInfo {
	
	CustomerDao cusDAO;
	
	public void add(int id,String name,String mobile,String email,int location_id)
	{

		
		String confFile = "ibasetApplicationContext.xml";
		
	    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
	     
	     cusDAO = (CustomerDao) context.getBean("CustomerDAOImpl");
	     
	     cusDAO.add(id, name, mobile, email, location_id);
	     
	     context.close();
	     
	}
	
}
