package com.esi.genom.services.users;

import org.springframework.stereotype.Service;

import com.esi.genom.entities.users.User;
import com.esi.genom.repository.users.UserRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Service
public class UserService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
    /**
     * 
     */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthority(user));
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	
	private Set<SimpleGrantedAuthority> getAuthority(User user) {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		user.getRoles().forEach(role -> {
			//authorities.add(new SimpleGrantedAuthority(role.getName()));
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
		});
		return authorities;
		//return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}
	/**
	 * 
	 * @return
	 */
	
	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
    /**
     * 
     * @param id
     */
	public void delete(long id) {
		userRepository.deleteById(id);
	}
	
	public User save(com.esi.genom.dto.users.UserDto user) {
	    User newUser = new User();
	    newUser.setUsername(user.getUsername());
	    newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setNom(user.getNom());
		newUser.setPrenom(user.getPrenom());
		newUser.setTelephone(user.getTelephone());
		newUser.setEmail(user.getEmail());
        return userRepository.save(newUser);
    }
	/**
	 * 
	 * @param id
	 * @return
	 */
	public User findById(Long id ) {
		return userRepository.findById(id).get();
	}

}
