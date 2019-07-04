package com.esi.genom.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.esi.genom.entities.Test;
import com.esi.genom.repositories.TestRepository;

@RestController()
public class TestController {
	@Autowired
	private TestRepository testRepository; 
	@GetMapping("tests")
	public Iterable<Test> index() {
		return testRepository.findAll();
	}
	@RequestMapping(method=RequestMethod.POST,value="tests")
	public void addTest(@RequestBody Test test) {
		testRepository.save(test);
		
	}

}
