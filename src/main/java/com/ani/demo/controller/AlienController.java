package com.ani.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ani.demo.dao.AlenRepo;
import com.ani.demo.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlenRepo repo;
	

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	
	@RequestMapping("/aliens")
	
	public List<Alien> getAliens()
	{
		
		return repo.findAll();
		
	}
	
	@RequestMapping("/aliens/{aid}")
	
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		
		return repo.findById(aid);
		
	}
	
	// POST Method
	
	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	// UPDATE
	@PutMapping("/alien")
	public Alien upsertAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
		
	}
	
	
	// DELETE
//	@DeleteMapping("/alien/{aid}")
//	public String deleteAlien(@PathVariable int aid)
//	{
//	;
//		repo.delete(alien);
//		return "deleted";
//	}
}


