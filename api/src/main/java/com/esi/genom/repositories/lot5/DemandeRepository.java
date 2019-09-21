package com.esi.genom.repositories.lot5;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Demande;
import com.esi.genom.entities.lot5.Demandeur;
import com.esi.genom.entities.lot5.EtatDemande;

@Repository
public interface DemandeRepository extends JpaRepository<Demande, Long>{
	
	public List<Demande> findByDateDemande(Date date);
	public List<Demande> findByDateDemande(Date date, Sort sort);
	
	public List<Demande> findByEtatDemande(EtatDemande etat);
	public List<Demande> findByEtatDemande(EtatDemande etat, Sort sort);
	
	public List<Demande> findByDemandeur(Demandeur demadandeur);
	public List<Demande> findByDemandeur(Demandeur demadandeur, Sort sort);

}
