package com.esi.genom.entities.users;



import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name ="users")
public class User  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	
	@Column(name = "user_username", length = 50,unique = true)
	@NotNull
    @Size(min = 4, max = 50)
	private String username;
	
	@Column(name = "user_password",length =100)
	@NotNull
    @Size(min = 4, max = 100)
	private String password;
	
	
	@Column(name = "user_nom",length = 50)
	@NotNull
	@Size(min = 4, max = 50)
	private String nom;
	
	
	@Column(name = "user_prenom",length = 50)
	@NotNull
    @Size(min = 4, max = 50)
	private String prenom;
	
	@Column(name = "user_tel")
	private String telephone;
	
	
	@Column(name = "user_mail",length = 50)
	@NotNull
    @Size(min = 4, max = 50)
	private String email;
	/**
	@Column(name = "ENABLED")
	@NotNull
	private Boolean enabled;
	
	
	@Column(name = "LAST_PASSWORD_RESET_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date lastPasswordResetDate;
	*/
	
	/**
	@NotNull
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "user_roles",	
            joinColumns = {@JoinColumn(name = "users_id")},
            inverseJoinColumns = {@JoinColumn(name = "roles_id")})
    */
	
	@ManyToOne(optional = false)
    @JoinColumn(name = "role_id")
	private Role roles;
	
	
	@JsonCreator
	public Long getId() {
		return id;
	}
	
	
	public User() {
		super();
	}


	public void setId(Long id) {
		this.id = id;
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

	public Role getRoles() {
		return roles;
	}

	public void setRoles(Role roles) {
		this.roles = roles;
	}

	


	

	
	
	
	

}
