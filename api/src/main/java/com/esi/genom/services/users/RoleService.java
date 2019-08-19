package com.esi.genom.services.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Annonce;
import com.esi.genom.entities.users.Role;
import com.esi.genom.repository.lot2.AnnonceRepository;
import com.esi.genom.repository.users.RoleRepository;

@Service
public class RoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> getAllRoles(){
		List<Role> roles = new ArrayList<>();
		
		roleRepository.findAll().forEach(roles::add);
		return roles;
	}
	
	/**
	 * Add new Role to the database
	 * @param annonce 
	 */
	public void addRole(Role role) {
		roleRepository.save(role);
	}
	
	/**
	 * 
	 * @param id
	 * @return the role of a specific id
	 */
	public Role getRole(Long id) {
		return roleRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateRole(Long id, Role role) {
		
	}
	
	public void deleteAnnonce(Long id) {	
		roleRepository.deleteById(id);
	}

}
