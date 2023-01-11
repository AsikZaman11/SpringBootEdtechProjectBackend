package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cupon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(unique = true)
	String cuponid;

	public Cupon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cupon(String cuponid) {
		super();
		this.cuponid = cuponid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCuponid() {
		return cuponid;
	}

	public void setCuponid(String cuponid) {
		this.cuponid = cuponid;
	}

	
	
}
