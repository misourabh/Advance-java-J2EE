package com.jspiders.hibernateonetomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmpDTO {
	
	@Id
	private int id;
	private String name;
	private String email;
	private String designation;
	private double salary;
	

}
