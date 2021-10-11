package com.te.mvc.HibernateMain;

import java.util.Scanner;

import com.mvc.Drivers.HibernateDrivers;
import com.mvc.Drivers.JDBC_Driver;
import com.te.mvc.HibernateDAO.HibernateDAO;
import com.te.mvc.JDBC_DAO.JDBC_DAO;

import net.bytebuddy.matcher.EqualityMatcher;

public class HibernateMain {
public static void main(String[] args) {
	
	HibernateDrivers drivers = new HibernateDrivers();
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter (JDBC) to execute JDBC mvc program "+
	
			" \n"
			+ "||  Enter (Hibernate) to execute Hibernate mvc Program");
	String type = scanner.next();
	if (type.equalsIgnoreCase("hibernate")) {
		drivers.HibernateProj();
		System.out.println("Updation using Hibernate is Done.....!!!!");
	}else if (type.equalsIgnoreCase("jdbc")) {
		JDBC_Driver dao =new JDBC_Driver();
		dao.JDBCProj();
		System.out.println("Updation using JDBC is Done.....!!!!");
	}else {
		System.err.println("Please Enter a Valid Input.....!!!!");
	}
	
	
	
}
}
