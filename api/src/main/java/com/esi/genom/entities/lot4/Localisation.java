package com.esi.genom.entities.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Images")
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
}
