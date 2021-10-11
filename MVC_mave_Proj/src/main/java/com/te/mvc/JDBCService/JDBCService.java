package com.te.mvc.JDBCService;

import com.te.mvc.JDBC_DAO.JDBC_DAO;
import com.te.mvc.dto.Employee;

public class JDBCService extends Employee implements JDBC {

	@Override
	public void update() {

        if((id>100)&&(id<500)) {
			
        	JDBC_DAO dao1=new JDBC_DAO();
			dao1.update();
				
		}else  
			System.err.println("Please Enter a Valid ID..!!");
	}

	@Override
	public void read() {
		  if((id>100)&&(id<500)) {
				
	        	JDBC_DAO dao1=new JDBC_DAO();
				dao1.update();
					
			}else  
				System.err.println("Please Enter a Valid ID..!!");		
	}

	@Override
	public void delete() {
		  if((id>100)&&(id<500)) {
				
	        	JDBC_DAO dao1=new JDBC_DAO();
				dao1.update();
					
			}else  
				System.err.println("Please Enter a Valid ID..!!");		
	}

}
