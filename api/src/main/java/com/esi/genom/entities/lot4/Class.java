package com.esi.genom.entities.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Class")
public class Class {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @JsonProperty("id")
	   private Integer id;
	   
	   @Column(name="nom")
	   @JsonProperty("nom")
	   private String nom;
	   
	   @Column(name="description")
	   @JsonProperty("description")
	   private String description;
	   


}
