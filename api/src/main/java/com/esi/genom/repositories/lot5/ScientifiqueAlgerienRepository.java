package com.esi.genom.repositories.lot5;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.ScientifiqueAlgerien;

@Repository
public interface ScientifiqueAlgerienRepository extends JpaRepository<ScientifiqueAlgerien, Long>{
	
	public List<ScientifiqueAlgerien> findByPrenom(String prenom);
	public List<ScientifiqueAlgerien> findByPrenom(String prenom, Sort sort);
	
	public List<ScientifiqueAlgerien> findByNom(String nom);
	public List<ScientifiqueAlgerien> findByNom(String nom, Sort sort);
	
	public List<ScientifiqueAlgerien> findByNomAndPrenom(String nom, String prenom);
	public List<ScientifiqueAlgerien> findByNomAndPrenom(String nom, String prenom, Sort sort);
	
	public List<ScientifiqueAlgerien> findByNumeroTelephone(String numeroTelephone);
	public List<ScientifiqueAlgerien> findByNumeroTelephone(String numeroTelephone, Sort sort);
	
	public List<ScientifiqueAlgerien> findByProfession(String Profession);
	public List<ScientifiqueAlgerien> findByProfession(String Profession, Sort sort);

}
