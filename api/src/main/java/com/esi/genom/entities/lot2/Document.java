package com.esi.genom.entities.lot2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.esi.genom.entities.users.User;
/**
 * @author ABDERRAHIM
 *
 */
@Entity

public class Document implements Serializable{
	
	private static final long serialVersionUID = -1019181716151413121L;

	
	@Column(name = "Document_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Document_titre", length = 200)
    @Size(min = 4, max = 200)
	private String titre ;
	
	@Column(name = "Document_file",length = 5000,columnDefinition="text")
	@Lob
    private String description;
	
	@Column(name = "document_date_ajout")
	
	private Date date_ajout;
	
	@Column(name = "document_valide")
	
	private Boolean valide;
	
	 @ManyToOne(optional = true)
	 @JoinColumn(name="users_id")
	private User creator;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
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
	
	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

}
