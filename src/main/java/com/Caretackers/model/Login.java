package com.Caretackers.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name = "login")
public class Login {
	
	@Id
	Integer id;
	Integer user_id;
	String username;
	String password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginController [id=" + id + ", user_id=" + user_id + ", username=" + username + ", password="
				+ password + "]";
	}
	public Login(Integer id, Integer user_id, String username, String password) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.username = username;
		this.password = password;
	}
	public Login() {
		super();
		
	}

}
