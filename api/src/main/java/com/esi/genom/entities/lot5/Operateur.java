package com.esi.genom.entities.lot5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "lot5_operateur")
public class Operateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_operateur")
	private Long id;
	
	@NotNull
	private String prenom;
	
	@NotNull
	private String nom;
	
	@NotNull
	private String email;
	
	@Column(name="numero_telephone", nullable = false, updatable = true)
	private String numeroTelephone;
	
	@NotNull
	private String adresse;
	
	@NotNull
	private String profession;
	
	@NotNull
	private String pays;
}
