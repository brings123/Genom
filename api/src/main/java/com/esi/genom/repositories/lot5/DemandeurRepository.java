package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Demandeur;

@Repository
public interface DemandeurRepository extends JpaRepository<Demandeur, Long>{
	
	public List<Demandeur> findByPrenom(String prenom);
	public List<Demandeur> findByPrenom(String prenom, Sort sort);
	
	public List<Demandeur> findByNom(String nom);
	public List<Demandeur> findByNom(String nom, Sort sort);
	
	public List<Demandeur> findByNomAndPrenom(String nom, String prenom);
	public List<Demandeur> findByNomAndPrenom(String nom, String prenom, Sort sort);
	
	public List<Demandeur> findByNumeroTelephone(String numeroTelephone);
	public List<Demandeur> findByNumeroTelephone(String numeroTelephone, Sort sort);
	
	public List<Demandeur> findByProfession(String Profession);
	public List<Demandeur> findByProfession(String Profession, Sort sort);

}
