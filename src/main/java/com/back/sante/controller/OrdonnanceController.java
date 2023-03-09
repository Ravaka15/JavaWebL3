package com.back.sante.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.sante.model.Consultation;
import com.back.sante.model.Ordonnance;
import com.back.sante.payload.OrdonnanceRequest;
import com.back.sante.payload.MessageResponse;
import com.back.sante.repository.OrdonnanceRepository;

import jakarta.validation.Valid;


@RestController
@CrossOrigin("http://localhost:3000")
public class OrdonnanceController {
	@Autowired
	private OrdonnanceRepository ordonnanceRepository;
	
	@PostMapping("/ordonnance")
	public ResponseEntity<?> registerOrdonnance(@Valid @RequestBody OrdonnanceRequest ordonnanceRequest) {
		Ordonnance ordonnance = new Ordonnance(ordonnanceRequest.getMedicament(),ordonnanceRequest.getNombreMedicament(),
				ordonnanceRequest.getDureeTraitement(),ordonnanceRequest.getModeTraitement(),ordonnanceRequest.getObservation());
		
		Set<String> strConsultation = ordonnanceRequest.getConsultation();
		Set<Consultation> consultations = new HashSet<>();
	
		
		ordonnance.setConsultations(consultations);
		ordonnanceRepository.save(ordonnance);

		return ResponseEntity.ok(new MessageResponse("Ordonnance enregistrer!"));
	}
}
