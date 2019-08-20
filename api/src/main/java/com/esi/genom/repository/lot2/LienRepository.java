package com.esi.genom.repository.lot2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot2.Lien;

public interface LienRepository extends CrudRepository<Lien,Long> {
	public List<Lien> findAll(String titre);
	public List<Lien> findTop10ByOrderByDate_ajoutDesc(Date date_ajout);


}
