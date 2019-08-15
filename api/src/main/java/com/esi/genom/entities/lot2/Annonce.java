/**
* @author ABDERRAHIM Djebablia
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
public class Annonce implements Serializable{
	private static final long serialVersionUID = -6790693372846798580L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "annonce_id",updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "annonce_titre",nullable = false)
	private String titre;
    
	@Column(name = "annonce_description",nullable = false)
    private String Description;
	
	@Column(name = "annonce_date_ajout")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_ajout;
	
	@Column(name = "annonce_img")
	private String image;
	
	@Column(name = "annonce_valide")
	@NotNull
	private Boolean valide;
	 @ManyToOne(optional = false)
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getDate_ajout() {
		return date_ajout;
	}
	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
