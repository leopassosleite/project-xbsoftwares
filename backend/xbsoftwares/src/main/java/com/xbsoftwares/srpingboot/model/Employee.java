package com.xbsoftwares.srpingboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "firstName")
	private String firtsName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "emaildId")
	private String emailId;
	
	@Column(name = "action")
	private String action;
	
	public Employee() {
		
	}
	
	public Employee(long id, String firtsName, String lastName, String emailId, String action) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.action = action;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirtsName() {
		return firtsName;
	}
	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
