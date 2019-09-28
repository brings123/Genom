package com.esi.genom.repositories.lot4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.esi.genom.entities.lot4.Type;
import com.esi.genom.entities.lot4.Valeur;
import com.esi.genom.entities.lot4.ValeurAbs;

public interface ValeurAbsRepository extends JpaRepository<ValeurAbs,Integer> {
	public List<ValeurAbs> findByName(String name);
	public List<ValeurAbs> findByCaracteristiqueId(Integer id);
	 @Modifying
	 @Transactional
	 public void deleteByName(String name);
}
