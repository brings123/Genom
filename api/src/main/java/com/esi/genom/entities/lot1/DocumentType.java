package com.esi.genom.entities.lot1;

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
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import com.esi.genom.entities.users.User;
import com.fasterxml.jackson.annotation.JsonProperty;

//Est que c'est une loi nationale, loi international, convention ...
@Entity
@Table(name = "lot1_type_document")
public class DocumentType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@JsonProperty("type_document_id")
	private Long typeDocumentId;
	
	@JsonProperty("nom_type_document")
    @Column(name="nom_type_document", nullable = false, updatable = true)
	@Size(max = 255)
	private String nomTypeDocument;
	
	@JsonProperty("description_type_document")
    @Column(name="description_type_document", nullable = false, updatable = true)
	private String descriptionTypeDocument;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "type_document_date_creation", nullable = false, updatable = false)
	@CreatedDate
	private Date typeDocumentDateCreation;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "createur_type_document", nullable = false, updatable = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User createurTypeDocument;
}
