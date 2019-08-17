package com.esi.genom.controller.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.users.Role;
import com.esi.genom.services.users.RoleService;

@RestController
public class RoleController {
	@Autowired
	private RoleService roleService;
	@RequestMapping("/roles")
	public List<Role> getAllAnnonce(){
		return roleService.getAllRoles();
	}
	
	@RequestMapping("/roles/{id}")
	public Role getRole(@PathVariable Long id) {
		return roleService.getRole(id);
	}
	
	@RequestMapping(value = "/roles",method =RequestMethod.POST)
    public void addAnnonce(@RequestBody Role role) {
		roleService.addRole(role);
	}	
	 

}
