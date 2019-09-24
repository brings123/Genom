package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.esi.genom.entities.lot5.EtatDemande;
import com.esi.genom.repositories.lot5.EtatDemandeRepository;

@Service
public class EtatDemandeService {
	
	@Autowired
	private EtatDemandeRepository etatDemandeRepository;
	private List<EtatDemande> etats = new ArrayList<>();

	
	public List<EtatDemande> getAllEtatDemande(){
		etatDemandeRepository.findAll().forEach(etats::add);
		return etats;
	}
	
	public List<EtatDemande> getAllEtatDemandeOrderedByEtat(){
		etatDemandeRepository.findAll(Sort.by(Sort.Direction.ASC, "etat")).forEach(etats::add);
		return etats;
	}
	
	public void addEtatDemande(EtatDemande etat) {
		etatDemandeRepository.save(etat);
	}
	
	public void updateEtatDemande(EtatDemande etat) {
		etatDemandeRepository.save(etat);
	}
	
	public void deleteEtatDemandeById(Long id) {
		etatDemandeRepository.deleteById(id);
	}
}
