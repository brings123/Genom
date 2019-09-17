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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Ressource")
public class Ressource implements Serializable {
	   private static final long serialVersionUID = 1L;
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
	   
	   @Column(name="validation")
	   @JsonProperty("validation")
	   private boolean validation;
	   
	   @ManyToOne(optional = false)
	   @JoinColumn(name = "type_id")
	   @JsonProperty("type")
	   private Type type;
	   
	   @ManyToOne(optional = false)
	   @JoinColumn(name = "class_id")
	   @JsonProperty("classe")
	   private Class classe;
	   
	   @ManyToOne(optional = false)
	   @JoinColumn(name = "categorie_id")
	   @JsonProperty("categorie")
	   private Categorie categorie;
	   
	  /* @ManyToMany
	   @JoinTable(name = "ressource_localisations",
       joinColumns = @JoinColumn(name = "ressource_id", referencedColumnName = "id"),
       inverseJoinColumns = @JoinColumn(name = "localisation_id", referencedColumnName = "id"))
	   private List<Localisation> localisations;*/
	   
	   /*@OneToMany(mappedBy = "ressource", cascade = CascadeType.ALL, fetch = FetchType.LAZY)    
		private Set<Images> images;*/

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

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public Ressource(Integer id, String name, String description, Categorie categorie
		) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.categorie = categorie;
	}

	public Ressource() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
	   
}
