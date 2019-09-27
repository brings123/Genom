package com.esi.genom.entities.lot3;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
public class Institut implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", length = 400)
	@JsonProperty("name")
	private String name ;
	
	@Column(name = "description", length = 400)
	@JsonProperty("description")
    private String description;
	
	@Column(name = "siteWeb", length = 400)
	@JsonProperty("siteWeb")
	private String siteWeb;
	@Column(name = "email", length = 400)
	@JsonProperty("email")
	private String email;
	
	//private String telFixe;
	//private String telPortable;
	@Column(name = "telephone", length = 400)
	@JsonProperty("telephone")
	private String telephone;
	//private String fax;
	
	//la relation entre intitution et user. 


	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	/*
	public Collection<Ressource> getRessources() {
		return ressources;
	}

	public void setRessources(Collection<Ressource> ressources) {
		this.ressources = ressources;
	}

	//relation entre Institutuion et RG.
	@OneToMany(mappedBy = "Institutution", orphanRemoval=true)
	@JsonIgnore
	private Collection<Ressource> ressources ;
	*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
