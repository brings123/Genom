package com.esi.genom.repositories.lot5;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.EtatDemande;
@Repository
public interface EtatDemandeRepository extends JpaRepository<EtatDemande, Long>{
	
	public List<EtatDemande> findByDateDebutEtatDemande(Date date);
	
	

}
