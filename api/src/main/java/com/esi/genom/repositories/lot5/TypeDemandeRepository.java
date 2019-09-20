package com.esi.genom.repositories.lot5;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.TypeDemande;

@Repository
public interface TypeDemandeRepository extends JpaRepository<TypeDemande, Long>{
	
	public TypeDemande findByType(String type);
	
	public void deleteByType(String type);

}
