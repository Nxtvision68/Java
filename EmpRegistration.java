package com.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmpRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.124:1521:orcl","visionbt1","visionbt1");
						System.out.println("table is created");
						Statement stmt = conn.createStatement();
						ResultSet rst =stmt.executeQuery("create table employeetable(emp_id number(10),First_Name varchar(20),Last_Name varchar(20),Gender varchar(10),Designation varchar(25),Skill_Set varchar(25),Experience varchar(10))");
						
						while(rst.next())
						{
							System.out.println("table is created");
						}
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	
	
	}

}
