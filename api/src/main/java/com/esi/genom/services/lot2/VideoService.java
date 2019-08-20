package com.esi.genom.services.lot2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.entities.lot2.Video;
import com.esi.genom.repository.lot2.VideoRepository;


@Service
public class VideoService {
	@Autowired
	private VideoRepository videoRepository;
	
	public List<Video> getAllVideos(){
		List<Video> videos = new ArrayList<>();
		
		videoRepository.findAll().forEach(videos::add);
		return videos;
	}
	
	/**
	 * Add new documents to the database
	 * @param annonce 
	 */
	public void addVideo(Video video) {
		videoRepository.save(video);
	}
	
	/**
	 * 
	 * @param id
	 * @return the document of a specific id
	 */
	public Video getVideo(Long id) {
		return videoRepository.findById(id).get();
	}

	/**
	 * 
	 * @param id
	 * @param annonce
	 */
	public void updateVideo(Video video) {
		videoRepository.save(video);
		
	}
	
	public void deleteVideo(Long id) {	
		videoRepository.deleteById(id);
	}
	
	/**
	 * get recent video added 
	 */
	public List<Video> getRecentVideo(){
		return videoRepository.findTop10ByOrderByDate_ajoutDesc();
	}

}
