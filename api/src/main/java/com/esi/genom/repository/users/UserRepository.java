package com.esi.genom.repository.users;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.users.User;

public interface UserRepository extends CrudRepository<User, Long>{
	 User findByUsername(String username);
}
