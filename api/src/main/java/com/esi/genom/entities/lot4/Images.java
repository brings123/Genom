package com.esi.genom.entities.lot4;

import java.io.Serializable;

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
public class Images implements Serializable{
	private static final long serialVersionUID = 1L;
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
	   
	   @ManyToOne(optional = false)
	    @JoinColumn(name = "ressource_id")
	   @JsonProperty("ressource")
	    private Ressource ressource;

	public Images() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Images(Integer id, String url, String alt, Ressource ressource) {
		super();
		this.id = id;
		this.url = url;
		this.alt = alt;
		this.ressource = ressource;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAlt() {
		return alt;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public Ressource getRessource() {
		return ressource;
	}

	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}
	   
}
