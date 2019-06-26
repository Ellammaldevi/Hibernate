package com.project.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee 
{
	
	@Id
	private int Id;
	private String Firstname;
	private String Lastname;
	private int Salary;
	private String Mail;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String Mail) {
		this.Mail = Mail;
	}
	@Override
	public String toString() {
		return "employee [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Salary=" + Salary
				+ ", Mail=" + Mail + "]";
	}
	
}
	
	
