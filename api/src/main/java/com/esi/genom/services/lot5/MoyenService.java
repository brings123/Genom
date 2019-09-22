package com.esi.genom.services.lot5;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.esi.genom.entities.lot5.Moyen;
import com.esi.genom.repositories.lot5.MoyenRepository;

@Service
public class MoyenService {
	
	@Autowired
	private MoyenRepository moyenRepository;
	private List<Moyen> moyens = new ArrayList<>();
	
	public List<Moyen> findAllMoyen(){
		moyenRepository.findAll().forEach(moyens::add);
		return moyens;
	}
	
	public List<Moyen> findAllMoyenOrderedByMoyen(){
		moyenRepository.findAll(Sort.by(Sort.Direction.ASC, "moyen")).forEach(moyens::add);
		return moyens;
	}
	
	public Moyen findMoyenById(Long id) {
		return moyenRepository.findById(id).get();
	}
	
	public Moyen findMoyenByMoyen(String moyen) {
		return moyenRepository.findByMoyen(moyen);
	}
	
	/*
	 * public Moyen findMoyenByTypeOrderedByMoyen(String type){
	 * moyenRepository.findByType(type, Sort.by(Sort.Direction.ASC,
	 * "moyen")).forEach(moyens::add);; return moyens; }
	 */
	
	public void addMoyen(Moyen moyen) {
		moyenRepository.save(moyen);
	}
	
	public void updateMoyen(Moyen moyen) {
		moyenRepository.save(moyen);
	}
	
	public void deleteMoyenById(Long id) {
		moyenRepository.deleteById(id);
	}
	
	public void deleteMoyenByMoyen(String moyen) {
		moyenRepository.deleteByMoyen(moyen);
	}

}
