package com.Caretackers.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="patientinfo")
public class PatientInfo {
	
	@Id
	Integer p_id;
	Integer user_id;
	String firstname;
	String Lastname;
	Date dob;
	String weight;
	String height;
	String address1;
	String address2;
	String address3;
	String problem;
	public Integer getP_id() {
		return p_id;
	}
	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAddress3() {
		return address3;
	}
	public void setAddress3(String address3) {
		this.address3 = address3;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public PatientInfo(Integer p_id, Integer user_id, String firstname, String lastname, Date dob, String weight,
			String height, String address1, String address2, String address3, String problem) {
		super();
		this.p_id = p_id;
		this.user_id = user_id;
		this.firstname = firstname;
		Lastname = lastname;
		this.dob = dob;
		this.weight = weight;
		this.height = height;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.problem = problem;
	}
	public PatientInfo() {
		super();
		
	}
	
	
	
	

}
