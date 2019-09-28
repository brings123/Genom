package com.esi.genom.entities.lot5;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import com.esi.genom.entities.lot4.Ressource;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "lot5_demande")
public class Demande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_demande", nullable = false)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "demande_date_creation", nullable = false, updatable = false)
	@CreatedDate
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateDemande;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "demande_date_debut_usage", nullable = false, updatable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateDebutUsage;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "demande_date_fin_usage", nullable = false, updatable = true)
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateFinUsage;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "etat_demande_id", nullable = false, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "etat_demande", updatable = true)
	private EtatDemande etatDemande;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "type_demande_id", nullable = false, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "etat_demande", updatable = true)
	private TypeDemande typeDemande;
	
	@ElementCollection
	@CollectionTable(name="interets_rg", joinColumns=@JoinColumn(name="id_demande"))
	@Column(name = "interets")
	private List<Ressource> interetsRG;
	
	@ElementCollection
	@CollectionTable(name="autorisations_rg", joinColumns=@JoinColumn(name="id_demande"))
	@Column(name = "autorisations")
	private List<Ressource> autorisationsRG;
	
	@ElementCollection
	@CollectionTable(name="collectes_rg", joinColumns=@JoinColumn(name="id_demande"))
	@Column(name = "collectes")
	private List<Ressource> collectesRG;
	
	@ElementCollection
	@CollectionTable(name="qtes_collectes_rg", joinColumns=@JoinColumn(name="collectes"))
	@Column(name = "qtes_collectes")
	private List<Double> qtesCollectes;
	
	@ElementCollection
	@CollectionTable(name="qtes_autorises_rg", joinColumns=@JoinColumn(name="autorisations"))
	@Column(name = "qtes_autorises")
	private List<Double> qtesAutorises;
	
	@ElementCollection
	@CollectionTable(name="prix_unitaires_rg", joinColumns=@JoinColumn(name="autorisations"))
	@Column(name = "prix")
	private List<Double> prixUnitaires;
	
	@ElementCollection
	@CollectionTable(name="moyens", joinColumns=@JoinColumn(name="id_demande"))
	@Column(name = "moyens")
	private List<Moyen> moyensUtilises;
	
	@ElementCollection
	@CollectionTable(name="zones_rg", joinColumns=@JoinColumn(name="id_demande"))
	@Column(name = "zones")
	private List<Zone> zones;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_demandeur", nullable = false, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "demandeur", updatable = true)
	private Demandeur demandeur;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_detenteur", nullable = true, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "detenteur", updatable = true)
	private Detenteur detenteur;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_operateur", nullable = true, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "operateur", updatable = true)
	private Operateur operateur;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "id_responsable", nullable = true, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "responsable", updatable = true)
	private Responsable responsable;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "scientifique_id", nullable = false, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "scientifique", updatable = true)
	private ScientifiqueAlgerien scientifique;
	

}
