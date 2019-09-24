package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot5.Demande;
import com.esi.genom.entities.lot5.Demandeur;
import com.esi.genom.entities.lot5.EtatDemande;
import com.esi.genom.repositories.lot5.DemandeRepository;

@Service
public class DemandeService {
	
	@Autowired
	private DemandeRepository demandeRepository;
	private List<Demande> demandes = new ArrayList<>();
	
	
	public List <Demande> getAllDemandes(){
		demandeRepository.findAll().forEach(demandes::add);
		return demandes;
	}
	
	public List <Demande> getAllDemandesOfDateDemande(Date date){
		demandeRepository.findByDateDemande(date, Sort.by(Sort.Direction.DESC, "dateDemande")).forEach(demandes::add);
		return demandes;
	}
	
	public List <Demande> getAllDemandesOfEtatDemande(EtatDemande etat){
		demandeRepository.findByEtatDemande(etat, Sort.by(Sort.Direction.DESC, "dateDemande")).forEach(demandes::add);
		return demandes;
	}
	
	public List <Demande> getAllDemandesOfDemandeur(Demandeur demandeur){
		demandeRepository.findByDemandeur(demandeur, Sort.by(Sort.Direction.DESC, "dateDemande")).forEach(demandes::add);
		return demandes;
	}
	
	public Demande getDemandeById(Long id) {
		return demandeRepository.findById(id).get();
	}
	
	public void addDemande(Demande demande) {
		demandeRepository.save(demande);
	}
	
	public void updateDemande(Demande demande) {
		demandeRepository.save(demande);
	}
	
	public void deleteDemandeById(Long id) {
		demandeRepository.deleteById(id);
	}

}
