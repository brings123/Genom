package com.esi.genom.entities.lot1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import com.fasterxml.jackson.annotation.JsonFormat;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "lot1_documenttsss")
@EntityListeners(AuditingEntityListener.class)
/*@JsonIgnoreProperties(
		value = {"document_id" ,"document_type", "createur_document", "modificateur_document"},
		allowGetters = true
		)*/
public class Documents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//@Size(max = 255)
    @Column(name="nom_document")
	@JsonProperty("nom_document")
	private String nomDocument;
	
    @Column(name="chemin_document")//, nullable = false)
    @JsonProperty("chemin_document")
    private String cheminDocument;
	
	/*
	 * //@Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "document_date_creation")//, nullable = false, updatable =
	 * false)
	 * 
	 * @CreatedDate
	 * 
	 * @JsonProperty("date_creation_document")
	 * 
	 * @JsonFormat(pattern="yyyy-MM-dd") private Date documentDateCreation;
	 */
	
	/*
	 * @Temporal(TemporalType.TIMESTAMP)
	 * 
	 * @Column(name = "document_date_modification", nullable =true, updatable =
	 * true)
	 * 
	 * @LastModifiedDate
	 * 
	 * @JsonProperty("date_modification_document")
	 * 
	 * @JsonFormat(pattern="yyyy-MM-dd") private Date documentDateModification;
	 */
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
	//@JoinColumn(name = "id_type_document", nullable = false, updatable = true) // @JoinColumn pour indiquer que c'est une clé étrangère
	//@OnDelete(action = OnDeleteAction.CASCADE)
	//@Column(name = "type_document", updatable = true)
	@Column(name = "type_document")//, nullable =false, updatable = true)
	@JsonProperty("type_document")
	private String documentType;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "id", nullable = false, updatable = false, insertable =
	 * false)
	 * 
	 * @OnDelete(action = OnDeleteAction.CASCADE) //@Column(name =
	 * "id_createur_document", updatable = true)
	 * 
	 * @JsonProperty("createur") private User createurDocument;
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "id", nullable = false, updatable = false, insertable =
	 * false)
	 * 
	 * @OnDelete(action = OnDeleteAction.CASCADE) //@Column(name =
	 * "id_modificateur_document", updatable = true)
	 * 
	 * @JsonProperty("modificateur") private User modificateurDocument;
	 */
}
