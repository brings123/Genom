package com.esi.genom.dto.users;

import java.io.Serializable;
import java.util.List;

import com.esi.genom.entities.users.Role;

public class UserDto implements Serializable{
	private static final long serialVersionUID = -987257642374843223L;

	private Long id;
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private Role roles;
    
    
    public Long getId() {
		return id;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Role getRoles() {
		return roles;
	}
	public void setRoles(Role roles) {
		this.roles = roles;
	}
	
	
	
}
