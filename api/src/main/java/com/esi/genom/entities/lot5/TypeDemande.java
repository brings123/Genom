package com.esi.genom.entities.lot5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lot5_type_demande")
public class TypeDemande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_type_demande")
	private Long id;
	
	@Column(name = "type_demande")
	private String type;
	
	@Column(name = "description_type_demande")
	private String description;

}
