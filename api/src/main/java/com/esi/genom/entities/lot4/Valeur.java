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
}
