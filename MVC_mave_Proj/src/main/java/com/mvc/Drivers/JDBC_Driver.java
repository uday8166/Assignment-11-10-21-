package com.mvc.Drivers;

import java.util.Scanner;

import com.te.mvc.JDBC_DAO.JDBC_DAO;

public class JDBC_Driver {

	
	public void JDBCProj() {
		JDBC_DAO dao = new JDBC_DAO();
		System.out.println("Enter 1 to update \n Enter 2 to Read \n Enter 3 to Delete ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		
		switch (value) {
		case 1: 
			dao.update();
			
			break;
			
case 2:dao.read();
			
			break;
			
			
case 3:dao.delete();
	
	break;

		default:
			break;
		}
		
	}
}
