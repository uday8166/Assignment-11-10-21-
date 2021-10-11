package com.te.mvc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	public int id;
	private String name;
	private int sal;
	
	public Employee() {
	}
	
	

}
