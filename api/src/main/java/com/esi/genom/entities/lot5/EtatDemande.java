package com.esi.genom.entities.lot5;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "lot5_etat_demande")
public class EtatDemande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_etat_demande", nullable = false)
	private Long id;
	
	//@NotNull
	@Column(name = "etat_demande", nullable = false,  updatable = true)
	private String etat;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_debut_etat_demande", nullable = false, updatable = true)
	private Date dateDebutEtatDemande;
	
	@Column(name = "description_etat_demande", nullable = false, updatable = true)
	private String descriptionEtat;

}
