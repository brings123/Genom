package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.entities.lot2.Video;
import com.esi.genom.services.lot2.DocumentService;
import com.esi.genom.services.lot2.VideoService;


@RestController
public class VideoController {
	@Autowired
	private VideoService videoService;
	
	@RequestMapping("/videos")
	public List<Video> getAllVideo(){
		return videoService.getAllVideos();
	}
	
	@RequestMapping("/videos/{id}")
	public Video getDocument(@PathVariable Long id) {
		return videoService.getVideo(id);

	}
	/**
	@RequestMapping(method =RequestMethod.POST)
    public void addDocument(@RequestBody Video video) {
		videoService.addVideo(video);
	}	*/

}
