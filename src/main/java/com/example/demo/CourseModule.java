package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CourseModule {
	
	@Id
	@GeneratedValue
	Integer id;
	
	String title;
	String des;
	String vid;
	public CourseModule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseModule(String title, String des, String vid) {
		super();
		this.title = title;
		this.des = des;
		this.vid = vid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getVid() {
		return vid;
	}
	public void setVid(String vid) {
		this.vid = vid;
	}
	
	
}
