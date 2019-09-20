package com.esi.genom.controller.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.users.Role;
import com.esi.genom.services.users.RoleService;
@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;
	@RequestMapping(value ="/roles/all",method =RequestMethod.GET)
	public List<Role> getAllAnnonce(){
		return roleService.getAllRoles();
	}
	
	
	
	@RequestMapping(value ="/roles/{id}",method =  RequestMethod.GET)
	public Role getRole(@PathVariable Long id) {
		return roleService.getRole(id);
	}
	
	
	@RequestMapping(value = "/role",method =RequestMethod.POST)
    public void addAnnonce(@RequestBody Role role) {
		roleService.addRole(role);
	}	
	 

}
