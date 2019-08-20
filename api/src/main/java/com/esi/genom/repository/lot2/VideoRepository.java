package com.esi.genom.repository.lot2;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esi.genom.entities.lot2.Video;

public interface VideoRepository extends CrudRepository<Video,Long> {
	public List<Video> findAll(String titre);
	public List<Video> findTop10ByOrderByDate_ajoutDesc();

}
