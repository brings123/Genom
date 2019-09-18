package com.esi.genom.entities.lot4;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Class")
public class Class implements Serializable {
	private static final long serialVersionUID = 1L;
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @JsonProperty("id")
	   @Column(name = "id")
	   private Integer id;
	   
	   @Column(name="name")
	   @JsonProperty("name")
	   private String name;
	   
	   @Column(name="description")
	   @JsonProperty("description")
	   private String description;
	   
	   @ManyToOne(optional = false)
	   @JoinColumn(name = "categorie_id")
	   @JsonProperty("categorie")
	   private Categorie categorie;

	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Class(Integer id, String name, String description, Categorie categorie) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.categorie = categorie;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
	   /*@OneToMany(mappedBy = "classe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
		private Set<Ressource> ressource;*/
	   


}
