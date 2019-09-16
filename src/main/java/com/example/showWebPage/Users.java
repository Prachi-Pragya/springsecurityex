package com.example.showWebPage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Users {
@Id

@NotNull
@GeneratedValue
private int id;
private String username;
 private String userpassword;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUserpassword() {
	return userpassword;
}
public void setUserpassword(String userpassword) {
	this.userpassword = userpassword;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


 
}
