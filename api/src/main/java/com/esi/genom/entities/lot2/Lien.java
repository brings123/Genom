package com.esi.genom.entities.lot2;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.esi.genom.entities.users.User;

@Entity
public class Lien implements Serializable {
	private static final long serialVersionUID = -1234563372846798580L;
	
	
	@Column(name = "lien_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "lien_titre", length = 200)
	@NotNull
    @Size(min = 4, max = 200)
	private String titre ;
	@Column(name = "lien_value", length = 200,unique = true)
	@NotNull
    private String lien;
	
	@Column(name = "lien_date_ajout")
	@NotNull
	private Date date_ajout;
	
	@Column(name = "lien_valide")
	@NotNull
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

	public String getLien() {
		return lien;
	}

	public void setLien(String lien) {
		this.lien = lien;
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
