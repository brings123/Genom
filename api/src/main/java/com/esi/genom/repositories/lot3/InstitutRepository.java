package com.esi.genom.repositories.lot3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot3.Institut;





@Repository
public interface InstitutRepository extends CrudRepository<Institut,Long>{

	public List<Institut> findByName(String name);
	public List<Institut> findByNameContainingIgnoreCase(String name);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
