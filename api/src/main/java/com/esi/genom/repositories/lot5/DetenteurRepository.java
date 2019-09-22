package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Detenteur;


@Repository
public interface DetenteurRepository extends JpaRepository<Detenteur, Long>{

	public List<Detenteur> findByPrenom(String prenom);
	public List<Detenteur> findByPrenom(String prenom, Sort sort);
	
	public List<Detenteur> findByNom(String nom);
	public List<Detenteur> findByNom(String nom, Sort sort);
	
	public List<Detenteur> findByNomAndPrenom(String nom, String prenom);
	public List<Detenteur> findByNomAndPrenom(String nom, String prenom, Sort sort);
	
	public List<Detenteur> findByNumeroTelephone(String numeroTelephone);
	public List<Detenteur> findByNumeroTelephone(String numeroTelephone, Sort sort);
	
	public List<Detenteur> findByProfession(String Profession);
	public List<Detenteur> findByProfession(String Profession, Sort sort);
}