package com.mvc.Drivers;

import java.util.Scanner;

import com.te.mvc.HibernateDAO.HibernateDAO;

public class HibernateDrivers {

	public void HibernateProj() {
HibernateDAO dao = new HibernateDAO();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter 1 to update \n Enter 2 to read \n enter 3 to Delete");
int value = scanner.nextInt();
switch (value) {
case 1: dao.update();
	
	break;

case 2:dao.read();
	
	break;
	
case 3:dao.delete();
	
	break;
default: System.err.println("Please Enter a Valid input");
	break;
}

	}

}
