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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.esi.genom.entities.users.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "evenement")
public class Events implements Serializable {
	
	private static final long serialVersionUID = -989776654336900079L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	@NotNull
	private String titre;
	@Column
	@NotNull
	private Date start_evnt;
	@Column
	@NotNull
	private Date end_evnt;
	@Column
	@NotNull
	private String description;
	
	@Column	
	private Boolean valide;
	 
//	@ManyToOne(optional = true)
//	@JoinColumn(name="users_id")
//	private User creator;
	/**
	 @JsonProperty("creator")
		public Long getResourceId() {
			return resource.getId();
		}
*/
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

	public Date getStart() {
		return start_evnt;
	}

	public void setStart(Date start) {
		this.start_evnt = start;
	}

	public Date getEnd() {
		return end_evnt;
	}

	public void setEnd(Date end) {
		this.end_evnt = end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
		
	
}

