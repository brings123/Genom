/**
 * @author ABDERRAHIM Djebablia
 *
 */
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.esi.genom.entities.users.User;

@Entity
public class Contact implements Serializable{
	private static final long serialVersionUID = -1798070786993154676L;
	@Column(name = "contact_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String id;
	
	@Column(name = "contact_name")
	private String name;
	@Column(name = "contact_email")
	private String email;
	@Column(name = "contact_tel")
	private String telephone;
	@Column(name = "contact_adresse")
	private String adresse;
	@Column(name = "contact_titre")
	private String titre;
	@Column(name = "contact_valide")
	@NotNull
	private Boolean valide; 
	@ManyToOne(optional = true)
	@JoinColumn(name="users_id")
	private User creator;
	
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

}
