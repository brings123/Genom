package com.esi.genom.entities.users;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;
@Table(name="roles")
@Entity
public class Role implements Serializable{
	private static final long serialVersionUID = -1398291839821412331L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 50, unique = true)
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleName name;
    
  
    
    

   

    public Role() {
    }

    public Role(final RoleName name) {
        this.name = name;
    }

    public Role(RoleName name, List<User> users) {
        this.name = name;
        //this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getName() {
        return name;
    }

    public void setName(RoleName name) {
        this.name = name;
    }

  

}