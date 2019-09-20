package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.esi.genom.entities.lot5.Accords;
import com.esi.genom.repositories.lot5.AccordsRepository;

@Service
public class AccordsService {
	
	@Autowired
	private AccordsRepository accordsRepository;
	private List<Accords> accords = new ArrayList<>();
	
	public List<Accords> getAllAccords(){
		accordsRepository.findAll().forEach(accords::add);
		return accords;
	}
	
	public List<Accords> getAllAccordsOrderedByDateAccord(){
		accordsRepository.findAll(Sort.by(Sort.Direction.DESC, "dateAccord")).forEach(accords::add);
		return accords;
	}
	
	public List<Accords> getAllAccordsOfCheminAccord(String cheminAccord){
		accordsRepository.findByCheminAccord(cheminAccord).forEach(accords::add);
		return accords;
	}
	
	public Accords getAccordsById(Long id) {
		return accordsRepository.findById(id).get();
	}
	
	public List<Accords> findByDateAccord(Date dateAccord){
		accordsRepository.findByDateAccord(dateAccord).forEach(accords::add);
		return accords;
	}
	
	public List<Accords> findByDateAccordOrderedByDateAccord(Date dateAccord){
		accordsRepository.findByDateAccord(dateAccord, Sort.by(Sort.Direction.DESC, "dateAccord")).forEach(accords::add);
		return accords;
	}
	
	public List<Accords> findByDemandeIdAndDateAccord(Long id, Date dateAccord){
		accordsRepository.findByDemandeIdAndDateAccord(id, dateAccord, Sort.by(Sort.Direction.DESC, "dateAccord")).forEach(accords::add);
		return accords;
	}
	
	public List<Accords> findBySourceAccord(String sourceAccord){
		accordsRepository.findBySourceAccord(sourceAccord, Sort.by(Sort.Direction.DESC, "sourceAccord")).forEach(accords::add);
		return accords;
	}
	
	public void addAccords(Accords accord ) {
		accordsRepository.save(accord);
	}
	
	public void updateAccords(Accords accord ) {
		accordsRepository.save(accord);
	}
	
	public void deleteById(Long id) {
		accordsRepository.deleteById(id);
	}
}
