package com.te.mvc.service;

import com.te.mvc.HibernateDAO.Hibernate;
import com.te.mvc.HibernateDAO.HibernateDAO;
import com.te.mvc.dto.Employee;

public class HibernateService extends Employee implements Service{

	@Override
	public void update() {
     
		if((id>100)&&(id<500)) {
			
			HibernateDAO dao=new HibernateDAO();
			dao.update();
				
		}else  
			System.err.println("Please Enter a Valid ID..!!");
	}

	@Override
	public void read() {
if((id>100)&&(id<500)) {
			
			HibernateDAO dao=new HibernateDAO();
			dao.update();
				
		}else  
			System.err.println("Please Enter a Valid ID..!!");		
	}

	@Override
	public void delete() {
if((id>100)&&(id<500)) {
			
			HibernateDAO dao=new HibernateDAO();
			dao.update();
				
		}else  
			System.err.println("Please Enter a Valid ID..!!");		
	}

}
