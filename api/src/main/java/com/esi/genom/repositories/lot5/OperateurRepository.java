package com.esi.genom.repositories.lot5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esi.genom.entities.lot5.Operateur;

@Repository
public interface OperateurRepository extends JpaRepository<Operateur, Long>{

}
