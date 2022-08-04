package com.example.demo.entity;
//Java Program to Illustrate Department.java File

//Importing required package modules


//Importing required classes
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

//Class
public class Department {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long departmentId;
 private String departmentName;
 public Long getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
private String departmentAddress;
 private String departmentCode;
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
}