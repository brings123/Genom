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
@Table(name = "lot5_moyens")
public class Moyen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_moyen")
	private Long id;
	
	@Column(name="moyen", nullable = false, unique  = true)
	private String moyen;
	
	@NotNull
	private String type; //moyen aeronotique, marine ou par terre
	
	@Null
	private String description;

}
