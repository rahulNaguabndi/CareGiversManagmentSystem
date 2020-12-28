package com.Caretackers.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="patientmedicine")
public class PatientMedicine {

	@Id
	Integer med_id;
	Integer user_id;
	String name;
	String dose;
	String form;
	String route;
	String strength;
	String frequency;
	Date datefrom;
	Date dateto;
	public Integer getMed_id() {
		return med_id;
	}
	public void setMed_id(Integer med_id) {
		this.med_id = med_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public Date getDatefrom() {
		return datefrom;
	}
	public void setDatefrom(Date datefrom) {
		this.datefrom = datefrom;
	}
	public Date getDateto() {
		return dateto;
	}
	public void setDateto(Date dateto) {
		this.dateto = dateto;
	}
	@Override
	public String toString() {
		return "PatirntMedicine [med_id=" + med_id + ", user_id=" + user_id + ", name=" + name + ", dose=" + dose
				+ ", form=" + form + ", route=" + route + ", strength=" + strength + ", frequency=" + frequency
				+ ", datefrom=" + datefrom + ", dateto=" + dateto + "]";
	}
	public PatientMedicine(Integer med_id, Integer user_id, String name, String dose, String form, String route,
			String strength, String frequency, Date datefrom, Date dateto) {
		super();
		this.med_id = med_id;
		this.user_id = user_id;
		this.name = name;
		this.dose = dose;
		this.form = form;
		this.route = route;
		this.strength = strength;
		this.frequency = frequency;
		this.datefrom = datefrom;
		this.dateto = dateto;
	}
	public PatientMedicine() {
		super();
		
	}
	
	
}
