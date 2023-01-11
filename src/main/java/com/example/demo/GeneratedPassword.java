package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GeneratedPassword {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(unique = true)
	String email;
	String password;
	String cls;
	String stdate;
	String enddate;
	public GeneratedPassword() {
		super();
		
	}
	

	public GeneratedPassword(String email, String password, String cls) {
		super();
		this.email = email;
		this.password = password;
		this.cls = cls;
	}






	public GeneratedPassword(String stdate, String enddate) {
		super();
		this.stdate = stdate;
		this.enddate = enddate;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}






	public String getCls() {
		return cls;
	}






	public void setCls(String cls) {
		this.cls = cls;
	}


	public String getStdate() {
		return stdate;
	}


	public void setStdate(String stdate) {
		this.stdate = stdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	
	
	
	
}
