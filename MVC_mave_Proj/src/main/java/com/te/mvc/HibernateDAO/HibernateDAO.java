package com.te.mvc.HibernateDAO;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;
import com.te.mvc.dto.Employee;

public class HibernateDAO implements Hibernate {

	@Override
	public void update() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a value for ID to be Updated : ");
		int id=scanner.nextInt();
		System.out.println("Enter the name to be set for "+id+ ": ");
		String name = scanner.next();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mappingData");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Employee table1 = manager.getReference(Employee.class, id);
		
		transaction.begin();
//		table1.setId(201);
		table1.setName(name);
		manager.persist(table1);
		transaction.commit();
		
	}

	@Override
	public void read() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for ID: ");
		int id = scanner.nextInt();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mappingData");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String qry = "select name from Employee where id= :id";
		javax.persistence.Query query = manager.createQuery(qry);
		query.setParameter("id", id);

		List<Employee> list = query.getResultList();

		System.out.println(list);
		System.out.println("-------------------------------");
		
		
	}

	@Override
	public void delete() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for ID: ");
		int value = scanner.nextInt();
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("mappingData");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		String qry = "delete from Employee where id = :id";
		javax.persistence.Query query = manager.createQuery(qry);
		query.setParameter("id", value) ;
		int result = query.executeUpdate(); 
		System.out.println(result);
		transaction.commit();
	}

}
