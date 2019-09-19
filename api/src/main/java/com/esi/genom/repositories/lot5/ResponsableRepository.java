package com.esi.genom.repositories.lot5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable, Long>{

}
