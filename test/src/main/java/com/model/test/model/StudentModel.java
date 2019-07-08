package com.model.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="Studentdb")
public class StudentModel {
	@Id
	@GeneratedValue
	//swagger
	@ApiModelProperty(notes="the database stored id")
	//swagger
	
	private long id;
	//swagger
	@ApiModelProperty(notes="The laptop names")
	//swagger
	
	private String name;
	private double cgpa;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
}
