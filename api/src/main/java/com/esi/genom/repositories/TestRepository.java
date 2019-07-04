package com.esi.genom.repositories;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.Test;

public interface TestRepository extends CrudRepository<Test , String> {

}
