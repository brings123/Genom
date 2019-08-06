package com.esi.genom.entities.lot2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.esi.genom.entities.users.User;
@Entity
@Table(name = "DOCUMENT")

public class Document implements Serializable{
	
	private static final long serialVersionUID = -1019181716151413121L;

	
	@Column(name = "Document_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "Document_titre", length = 200)
	@NotNull
    @Size(min = 4, max = 200)
	private String titre ;
	@Column(name = "Document_file", length = 200,unique = true)
	@NotNull
    private String file_path;
	
	@Column(name = "document_date_ajout")
	@NotNull
	private Date date_ajout;
	
	@Column(name = "document_valide")
	@NotNull
	private Boolean valide;
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User creator;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

	public Date getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}

	public Boolean getValide() {
		return valide;
	}

	public void setValide(Boolean valide) {
		this.valide = valide;
	}
	
	

}
