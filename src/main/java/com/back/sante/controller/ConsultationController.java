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
import com.back.sante.model.User;
import com.back.sante.repository.ConsultationRepository;
import com.back.sante.repository.UserRepository;
import com.back.sante.payload.ConsultationRequest;
import com.back.sante.payload.MessageResponse;

import jakarta.validation.Valid;

@RestController
@CrossOrigin("http://localhost:3000")
public class ConsultationController {

	@Autowired
	private ConsultationRepository consultationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/consultation")
	public ResponseEntity<?> registerConsultation(@Valid @RequestBody ConsultationRequest consultationRequest) {
		Consultation consultation = new Consultation(consultationRequest.getMaladie(),consultationRequest.getResultat(),
				consultationRequest.getDate_consultation());
		
		Long strUsers = consultationRequest.getUser();
		Set<User> users = new HashSet<>();
		if (strUsers == null) {
			User userConsultation = userRepository.findById(strUsers)
					.orElseThrow(() -> new RuntimeException("Error: Patient introuvable."));
			users.add(userConsultation);
		} else {
			User userConsultation = userRepository.findById(strUsers)
					.orElseThrow(() -> new RuntimeException("Error: Patient introuvable."));
			users.add(userConsultation);
		}
		
		consultation.setUsers(users);
		System.out.println(strUsers);
		consultationRepository.save(consultation);

		return ResponseEntity.ok(new MessageResponse("Consultation enregistrer!"));
	}
	
}