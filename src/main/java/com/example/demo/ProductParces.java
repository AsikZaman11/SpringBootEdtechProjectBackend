package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class ProductParces {

@Id
@GeneratedValue
Integer id;
String name;
String mobile;
String address;
String productName;
String cls;
String date;
int productQantity;
int total;
String approv;
public ProductParces() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductParces(String name, String mobile, String address, String productName, String cls, String date,
		int productQantity, int total, String approv) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.address = address;
	this.productName = productName;
	this.cls = cls;
	this.date = date;
	this.productQantity = productQantity;
	this.total = total;
	this.approv = approv;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getCls() {
	return cls;
}
public void setCls(String cls) {
	this.cls = cls;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getProductQantity() {
	return productQantity;
}
public void setProductQantity(int productQantity) {
	this.productQantity = productQantity;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public String getApprov() {
	return approv;
}
public void setApprov(String approv) {
	this.approv = approv;
}




}
