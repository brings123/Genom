package com.esi.genom.entities.lot5;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "lot5_demandeur")
public class Demandeur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_demandeur", nullable = false)
	private Long idDemandeur;
	
	@Column(name="prenom", nullable = false)
	private String prenom;
	
	@Column(name="nom", nullable = false)
	private String nom;
	
	@Column(name="date_de_naissance", nullable = false)
	private Date dateNaissance;
	
	@Column(name="adresse", nullable = false)
	private String adresse;
	
	@Column(name="zip_code", nullable = false)
	private int zipCode;
	
	@Column(name="ville", nullable = false)
	private String ville;
	
	@Column(name="pays", nullable = false)
	private String pays;
	
	@Column(name="numero_telephone", nullable = false)
	private String numeroTelephone;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="profession", nullable = false)
	private String profession;
	
	@Column(name="organisation", nullable = false)
	private String organisation;
	
	@Column(name="chemin_avatar", nullable = false)
	private String cheminAvatar;
	
	@Column(name="chemin_preuve_identite", nullable = false)
	private String cheminPreuveIdentite;

}
