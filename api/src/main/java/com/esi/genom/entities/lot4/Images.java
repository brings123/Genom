package com.esi.genom.entities.lot4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Images")
public class Images {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @JsonProperty("id")
	   private Integer id;
	   
	   @Column(name="url")
	   @JsonProperty("url")
	   private String url;
	   
	   @Column(name="alt")
	   @JsonProperty("alt")
	   private String alt;
	   
	   @ManyToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "ressource_id", nullable = false)
	    @JsonIgnore
	    private Ressource ressource;
}
