package com.esi.genom.entities.lot5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Entity
@Table(name = "lot5_detenteur")
public class Detenteur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_detenteur", nullable = false)
	private Long id;
	
	@Column(name="prenom", nullable = false)
	private String prenom;
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column(name="adresse", nullable = false)
	private String adresse;
	
	@Column(name="numero_telephone", nullable = false)
	private String numeroTelephone;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@NotNull
	private String profession;
	
	@NotNull
	private String organization;
	
	@Null
	private String description;
}
