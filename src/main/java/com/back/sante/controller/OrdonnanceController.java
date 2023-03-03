package com.back.sante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.sante.model.Ordonnance;
import com.back.sante.repository.OrdonnanceRepository;


@RestController
@CrossOrigin("http://localhost:3000")
public class OrdonnanceController {
	@Autowired
	private OrdonnanceRepository ordonnanceRepository;
	
	@PostMapping("/ordonnance")
	Ordonnance newOrdonnance(@RequestBody Ordonnance newOrdonnance) {
		return ordonnanceRepository.save(newOrdonnance);
	}

}
