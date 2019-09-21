package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Operateur;

@Repository
public interface OperateurRepository extends JpaRepository<Operateur, Long>{
	
	public List<Operateur> findByPrenom(String prenom);
	public List<Operateur> findByPrenom(String prenom, Sort sort);
	
	public List<Operateur> findByNom(String nom);
	public List<Operateur> findByNom(String nom, Sort sort);
	
	public List<Operateur> findByNomAndPrenom(String nom, String prenom);
	public List<Operateur> findByNomAndPrenom(String nom, String prenom, Sort sort);
	
	public List<Operateur> findByNumeroTelephone(String numeroTelephone);
	public List<Operateur> findByNumeroTelephone(String numeroTelephone, Sort sort);
	
	public List<Operateur> findByProfession(String Profession);
	public List<Operateur> findByProfession(String Profession, Sort sort);

}
