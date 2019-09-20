package com.esi.genom.repositories.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot4.Categorie;
import com.esi.genom.entities.lot4.Type;
import com.esi.genom.entities.lot4.Valeur;

public interface ValeurRepository extends JpaRepository<Valeur,Integer> {
	public List<Valeur> findByName(String name);
	public List<Valeur> findByRessourceId(Integer id);
	public List<Valeur> findByCaracteristiqueId(Integer id);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
