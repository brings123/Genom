package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Moyen;

@Repository
public interface MoyenRepository extends JpaRepository<Moyen, Long>{
	
	public Moyen findByMoyen(String moyen);
	
	public List<Moyen> findByType(String type);
	public List<Moyen> findByType(String type, Sort sort);

	
	public void deleteByMoyen(String moyen);
}
