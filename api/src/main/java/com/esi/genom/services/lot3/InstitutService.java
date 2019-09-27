package com.esi.genom.services.lot3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot3.Institut;
import com.esi.genom.repositories.lot3.InstitutRepository;



@Service
public class InstitutService {

	@Autowired
	public InstitutRepository InstitutRepository;

	
	
	public Institut getInstitut(Long id) {
		return InstitutRepository.findById(id).get();
	}

	public void addInstitut(Institut Institut) {
		InstitutRepository.save(Institut);

	}

	public List<Institut> getAllInstituts() {
		List<Institut> Instituts = new ArrayList<>();

		InstitutRepository.findAll().forEach(Instituts::add);
		return Instituts;
	}

	public void deleteInstitut(Long id) {
		InstitutRepository.deleteById(id);
	}

}
