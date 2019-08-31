package com.esi.genom.entities.lot4;

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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Ressource")
public class Ressource {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @JsonProperty("id")
	   private Integer id;
	   
	   @Column(name="name")
	   @JsonProperty("name")
	   private String name;
	   
	   @Column(name="description")
	   @JsonProperty("description")
	   private String description;
	   
	   @ManyToOne(fetch = FetchType.LAZY, optional = false)
	   @JoinColumn(name = "type_id", nullable = false)
	   @JsonIgnore
	   private Type type;
	   
	   @ManyToOne(fetch = FetchType.LAZY, optional = false)
	   @JoinColumn(name = "classe_id", nullable = false)
	   @JsonIgnore
	   private Class classe;
	   
	   @ManyToOne(fetch = FetchType.LAZY, optional = false)
	   @JoinColumn(name = "categorie_id", nullable = false)
	   @JsonIgnore
	   private Categorie categorie;
	   
	   @ManyToMany
	   private List<Localisation> localisations;
	   
	   @OneToMany(mappedBy = "ressource", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
		private Set<Images> images;
	   
	   
	   
}
