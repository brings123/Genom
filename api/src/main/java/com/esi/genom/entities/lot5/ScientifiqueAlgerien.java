package com.esi.genom.entities.lot5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lot5_scientifique_algerien")
public class ScientifiqueAlgerien {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_scientifique", nullable = false)
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
	
	@Column(name="profession", nullable = false)
	private String profession;
	
	@Column(name="organisation", nullable = false)
	private String organization;
	
	@NotNull
	private String description;
}
