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
@Table(name = "lot5_zone")
public class Zone {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_zone", nullable = false)
	private Long id;
	
	@NotNull
	private String zone;
	
	@NotNull
	private Double langitude;
	
	@NotNull
	private Double latitude;
	
	@Null
	private Double altitude; //optional
}
