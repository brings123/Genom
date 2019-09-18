package com.esi.genom.entities.lot4;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Categorie")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	@Column(name = "id")
	private Integer id;
	
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	
	@JsonProperty("description")
    @Column(name="description")
	private String description;
	
	
	/*@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<Ressource> ressources;*/
	
	/*@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<Type> types;
	
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<Class> classes;
	
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
	private Set<Caracteristique> caracteristique;
	*/
	
	public Categorie() {
	}

	public Categorie(Integer categorieid, String name, String description, Set<Caracteristique> caracteristique) {
		super();
		this.id = categorieid;
		this.name = name;
		this.description = description;
	}




	public Integer getCategorieid() {
		return id;
	}

	public void setCategorieid(Integer categorieid) {
		this.id = categorieid;
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

}
