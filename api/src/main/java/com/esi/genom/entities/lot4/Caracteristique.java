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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "Caracteristique")
public class Caracteristique implements Serializable {
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
	
	@JsonProperty("degSecurite")
    @Column(name="degSecurite")
	private Integer degSecurite;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "categorie_id")
	@JsonProperty("categorie")
	private Categorie categorie;
	

	public Caracteristique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Caracteristique(Integer id, String name, String description, Integer degSecurite, Categorie categorie) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.degSecurite = degSecurite;
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

	public Integer getDegSecurite() {
		return degSecurite;
	}

	public void setDegSecurite(Integer degSecurite) {
		this.degSecurite = degSecurite;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
