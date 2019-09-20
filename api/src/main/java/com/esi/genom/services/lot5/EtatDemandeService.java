package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.esi.genom.entities.lot5.EtatDemande;
import com.esi.genom.repositories.lot5.EtatDemandeRepository;

@Service
public class EtatDemandeService {
	
	@Autowired
	private EtatDemandeRepository etatDemandeRepository;
	private List<EtatDemande> etats = new ArrayList<>();

}
