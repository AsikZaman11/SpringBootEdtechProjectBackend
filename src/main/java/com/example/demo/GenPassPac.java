package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GenPassPac {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@Column(unique = true)
	String email;
	String password;
	String cls;
	String sub;
	public GenPassPac() {
		super();
		
	}
	public GenPassPac(String email, String password, String cls, String sub) {
		super();
		this.email = email;
		this.password = password;
		this.cls = cls;
		this.sub = sub;
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
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
}
