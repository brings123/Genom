package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long>{
	
	public List<Responsable> findByPrenom(String prenom);
	public List<Responsable> findByPrenom(String prenom, Sort sort);
	
	public List<Responsable> findByNom(String nom);
	public List<Responsable> findByNom(String nom, Sort sort);
	
	public List<Responsable> findByNomAndPrenom(String nom, String prenom);
	public List<Responsable> findByNomAndPrenom(String nom, String prenom, Sort sort);
	
	public List<Responsable> findByNumeroTelephone(String numeroTelephone);
	public List<Responsable> findByNumeroTelephone(String numeroTelephone, Sort sort);
	
	public List<Responsable> findByProfession(String Profession);
	public List<Responsable> findByProfession(String Profession, Sort sort);

}
