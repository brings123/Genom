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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.esi.genom.entities.users.User;

@Entity
@Table(name = "CONTACT")
public class Contact implements Serializable{
	private static final long serialVersionUID = -1798070786993154676L;
	@Column(name = "contact_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private String id;
	@Column(name = "contact_email")
	private String email;
	@Column(name = "contact_tel")
	private String telephone;
	@Column(name = "contact_adresse")
	private String adresse;
	@Column(name = "contact_date_ajout")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_ajout;
	@Column(name = "contact_valide")
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
