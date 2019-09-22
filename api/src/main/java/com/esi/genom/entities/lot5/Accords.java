package com.esi.genom.entities.lot5;

import java.util.Date;

import javax.persistence.Column;
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

@Entity
@Table(name = "lot5_accords")
public class Accords {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_accord", nullable =false)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_creation_accord", nullable = false, updatable = false) // le temps qui est sur le papier de l'accord
	@CreatedDate
	private Date dateAccord;
	
	@Column(name = "source_accord", nullable =false)
	private String sourceAccord;
	
	@Column(name = "chemin_accord", nullable =false, updatable = true)
	private String cheminAccord;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "demande_id", nullable = false, updatable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "demande", updatable = true)
	private Demande demande;
}
