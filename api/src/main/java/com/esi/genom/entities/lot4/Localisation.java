package com.esi.genom.entities.lot4;

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
@Table(name = "Localisation")
public class Localisation {

	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @JsonProperty("id")
	   private Integer id;
	   
	   @Column(name="pays")
	   @JsonProperty("pays")
	   private String pays;
	   
	   @Column(name="ville")
	   @JsonProperty("ville")
	   private String ville;
	   
	   @Column(name="latitude")
	   @JsonProperty("latitude")
	   private String latitude;
	   
	   @Column(name="longitude")
	   @JsonProperty("longitude")
	   private String longitude;
	   
	   @ManyToMany(mappedBy = "localisations")    
	   private Set<Ressource> ressources;
}
