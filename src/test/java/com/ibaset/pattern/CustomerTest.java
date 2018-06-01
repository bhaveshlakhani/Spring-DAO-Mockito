package com.ibaset.pattern;


import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;


import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.MockitoAnnotations;

import com.ibaset.Spring_JDBC.Customer;
import com.ibaset.Spring_JDBC.CustomerDao;
import com.ibaset.Spring_JDBC.ICustomerImpl;
import com.ibaset.Spring_JDBC.Invalidmobilenumber;

public class CustomerTest {

	@Mock
    CustomerDao dao;
	
	@InjectMocks
	ICustomerImpl icustomerimpl=new ICustomerImpl();
	
	@Before
	public void setup()
	{
        MockitoAnnotations.initMocks(this);	
    
	}
	
	Customer customer=new Customer();
	
	@Test(expected=Invalidmobilenumber.class)
	public void CustomerAddTestshouldthrowExceptionifnumberofdigitisnot10() throws Invalidmobilenumber
	{
			icustomerimpl.add(2,"bhavesh","756544","bhaveshlakhani",10);
		
		     customer.setId(2);
	         customer.setName("Abhishek");
	         customer.setMobile(888544777);
	         customer.setEmail("bahvesh@gmail.com");
	         customer.setLocation_id(121);
		
	         when(dao.save(customer)).thenReturn(1);
	  
	         System.out.println(dao.save(customer));
		
	         verify(dao).save(any(Customer.class));
	         
	}
	
}
