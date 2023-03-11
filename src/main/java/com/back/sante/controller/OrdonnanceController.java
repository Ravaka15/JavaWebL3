package com.back.sante.controller;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.sante.model.Consultation;
import com.back.sante.model.Ordonnance;
import com.back.sante.model.User;
import com.back.sante.payload.OrdonnanceRequest;
import com.back.sante.print.ReportService;
import com.back.sante.payload.MessageResponse;
import com.back.sante.repository.ConsultationRepository;
import com.back.sante.repository.OrdonnanceRepository;

import jakarta.validation.Valid;
import net.sf.jasperreports.engine.JRException;


@RestController
@CrossOrigin("http://localhost:3000")
public class OrdonnanceController {
	@Autowired
	private OrdonnanceRepository ordonnanceRepository;
	
	@Autowired
	private ConsultationRepository consultationRepository;
	
	@Autowired
	private ReportService service;
	
	@PostMapping("/ordonnance")
 	public ResponseEntity<?> registerOrdonnance(@Valid @RequestBody OrdonnanceRequest ordonnanceRequest) {
		Ordonnance ordonnance = new Ordonnance(ordonnanceRequest.getMedicament(),ordonnanceRequest.getNombre_medicament(),
				ordonnanceRequest.getDuree_traitement(),ordonnanceRequest.getMode_traitement(),
				ordonnanceRequest.getObservation());
	

		Long strConsultation = ordonnanceRequest.getConsultation();
		Set<Consultation> consultations = new HashSet<>();
		if (strConsultation == null) {
			Consultation consultationOrdonnance = consultationRepository.findById(strConsultation)
					.orElseThrow(() -> new RuntimeException("Error: Consultation introuvable."));
			consultations.add(consultationOrdonnance);
		} else {
			Consultation consultationOrdonnance = consultationRepository.findById(strConsultation)
					.orElseThrow(() -> new RuntimeException("Error: Consultation introuvable."));
			consultations.add(consultationOrdonnance);
		}
	
		
		ordonnance.setConsultations(consultations);
		ordonnanceRepository.save(ordonnance);

		return ResponseEntity.ok(new MessageResponse("Ordonnance enregistrer!"));
	}
	
	@GetMapping("/ordonnances")
	List<Ordonnance> getAllOrdonnances() {
		return ordonnanceRepository.findAll();
	}
	
	
	@GetMapping("/print/{format}")
	public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException{
		return service.exportsReport(format);
	}
}
