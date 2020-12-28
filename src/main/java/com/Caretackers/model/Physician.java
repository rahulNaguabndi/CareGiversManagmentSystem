package com.Caretackers.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="physician")
public class Physician {
	@Id
	Integer id;
	Integer user_id;
	String fullname;
	String email;
	String qualifications;
	String specialization;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualifications() {
		return qualifications;
	}
	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Physician [id=" + id + ", user_id=" + user_id + ", fullname=" + fullname + ", email=" + email
				+ ", qualifications=" + qualifications + ", specialization=" + specialization + "]";
	}
	
	
	
	public Physician() {
		super();
		
	}
	public Physician(Integer id, Integer user_id, String fullname, String email, String qualifications,
			String specialization) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.fullname = fullname;
		this.email = email;
		this.qualifications = qualifications;
		this.specialization = specialization;
	}
	
	
	

}
