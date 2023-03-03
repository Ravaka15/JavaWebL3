package com.back.sante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.sante.model.Consultation;
import com.back.sante.repository.ConsultationRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class ConsultationController {

	@Autowired
	private ConsultationRepository consultationRepository;
	
	@PostMapping("/consultation")
	Consultation newConsultation(@RequestBody Consultation newConsultation) {
		return consultationRepository.save(newConsultation);
	}
}
