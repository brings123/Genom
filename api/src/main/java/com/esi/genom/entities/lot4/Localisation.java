package com.esi.genom.entities.lot4;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
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
public class Localisation implements Serializable{
	private static final long serialVersionUID = 1L;
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
	   
	   @ManyToOne(optional = false)
	   @JoinColumn(name = "ressource_id")
	   @JsonProperty("ressource")
	   private Ressource ressource;
	   
	   public Localisation(Integer id, String pays, String ville, String latitude, String longitude, Ressource ressource) {
		super();
		this.id = id;
		this.pays = pays;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.ressource = ressource;
	}

	/*@ManyToMany(mappedBy = "localisations")    
	   private List<Ressource> ressources;*/

	public Ressource getRessource() {
		return ressource;
	}

	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}

	public Localisation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Localisation(Integer id, String pays, String ville, String latitude, String longitude) {
		super();
		this.id = id;
		this.pays = pays;
		this.ville = ville;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	   
}
