package com.esi.genom.repositories.lot5;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Accords;


@Repository
public interface AccordsRepository extends JpaRepository<Accords, Long>{

	public List<Accords> findByCheminAccord(String chemin);
	
	public List<Accords> findByDemandeId(Long id);
	
	public List<Accords> findByDateAccord(Date dateAccord);
	public List<Accords> findByDateAccord(Date dateAccord, Sort sort );
	
	
	public List<Accords> findByDemandeIdAndDateAccord(Long id, Date dateAccord, Sort sort);
	
	public List<Accords> findBySourceAccord(String sourceAccord, Sort sort);
	
	//public void deleteBy()
	
	
}
