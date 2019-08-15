package com.esi.genom.repositories.lot4;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot4.Localisation;

public interface LocalisationRepository extends JpaRepository<Localisation,Integer> {

}
