package com.esi.genom.repositories.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot4.Categorie;
import com.esi.genom.entities.lot4.Class;

public interface ClassRepository extends JpaRepository<Class,Integer> {
	public List<Class> findByName(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
