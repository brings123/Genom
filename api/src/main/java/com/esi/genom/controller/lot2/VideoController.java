package com.esi.genom.controller.lot2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.lot2.Document;
import com.esi.genom.entities.lot2.Lien;
import com.esi.genom.entities.lot2.Video;
import com.esi.genom.services.lot2.DocumentService;
import com.esi.genom.services.lot2.VideoService;


@RestController
public class VideoController {
	@Autowired
	private VideoService videoService;
	/**
	 * GET all video 
	 * @return
	 */
	@RequestMapping(method =RequestMethod.GET,value="/videos/all")
	public List<Video> getAllVideo(){
		return videoService.getAllVideos();
	}
	/**
	 * Get video By id
	 * @param id
	 * @return
	 */
	
	@RequestMapping(method =RequestMethod.GET,value="/videos/{id}")
	public Video getVideo(@PathVariable Long id) {
		return videoService.getVideo(id);

	}
	
	/**
	 * 
	 * get all recent video added
	 */
	@RequestMapping(method =RequestMethod.GET,value="/videos/recent")
	public List<Video> getRecentVideo() {
		return videoService.getRecentVideo();
	}
	
	@RequestMapping(value="video",method =RequestMethod.POST)
    public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}
	
	/**
	 * UPDATE Lien 
	 * @param liens
	 * @param id
	 */
	
	@RequestMapping(value="/videos/update/{id}",method =RequestMethod.PUT)
    public void updateVideo(@RequestBody Video video,@PathVariable Long id) {
		videoService.updateVideo(video);
	}	
	

}
