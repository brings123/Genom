package com.esi.genom.entities.lot4;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "valeur")
public class Valeur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("name")
    @Column(name="name")
	private String name;
	
	@JsonProperty("description")
    @Column(name="description")
	private String description;
	
	@JsonProperty("val")
    @Column(name="val")
	private String val;
	
	@ManyToMany(mappedBy="valeurs")
	private List<Caracteristique> caracteristique;

	public Valeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Valeur(Integer id, String name, String description, String val, List<Caracteristique> caracteristique) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.val = val;
		this.caracteristique = caracteristique;
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

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public List<Caracteristique> getCaracteristique() {
		return caracteristique;
	}

	public void setCaracteristique(List<Caracteristique> caracteristique) {
		this.caracteristique = caracteristique;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
