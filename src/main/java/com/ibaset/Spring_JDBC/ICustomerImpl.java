package com.ibaset.Spring_JDBC;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ICustomerImpl implements ICustomer {

	CustomerDao cusDAO;

	public void add(int id, String name, String mobile, String email, int location_id) throws Invalidmobilenumber {
		int numberofdigit = getnumberofdigit(mobile);

		if (numberofdigit != 10) {
				System.out.println("inside if -->debuging..........");
				throw new Invalidmobilenumber();
		}

		else {

			String confFile = "applicationContext.xml";

			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);

			cusDAO = (CustomerDao) context.getBean("CustomerDAOImpl");

			Customer customer = new Customer();

			customer.setId(id);
			customer.setName(name);
			customer.setMobile(Long.parseLong(mobile));
			customer.setEmail(email);
			customer.setLocation_id(location_id);

			cusDAO.save(customer);

			context.close();

		}

	}

	public int getnumberofdigit(String mobile) {
		return mobile.length();

	}

}
