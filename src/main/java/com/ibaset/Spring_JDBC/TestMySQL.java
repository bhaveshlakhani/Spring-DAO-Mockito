package com.ibaset.Spring_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class TestMySQL 
{

	public static void main(String[] args) throws ClassNotFoundException
	{
	
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		
		
		try
		{
			
			/*
			 * load the driver
			 */
			
			
		Class.forName("com.mysql.jdbc.Driver");
		
	
		     /*
		      * get the db connection via driver
		      * 
		      * 
		      * dburl-protocol:subprotocol:subname
		      * 
		      * sub name consist:
		      * --hostname
		      * --port number;
		      * --db name
		      * --user&password		 
		     */
		
		
  //jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false
		
		
		   String url="jdbc:mysql://localhost:3306/test";
	    
		   con=DriverManager.getConnection(url,"root","root");
		   
		   System.out.println("connection successfull"+con);
		
		
     
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		} 
		
		
		
		finally
		{
			try
			{
			if(con!=null)
			{
				con.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			
			if(rs!=null)
			{
				rs.close();
			}
			
			
		}
			
			catch(SQLException e)
			
			 {
				e.printStackTrace();
			 }
			
		
			}
					
		}
		
	}
	

