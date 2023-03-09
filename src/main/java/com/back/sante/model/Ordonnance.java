package com.back.sante.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Ordonnance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id_ordonnance;
	String medicament;
	String nombre_medicament;
	String duree_traitement;
	String mode_traitement;
	String observation;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "consultation_ordonnance", joinColumns = @JoinColumn(name = "ordonnance_id"),
	inverseJoinColumns = @JoinColumn(name = "consultation_id"))

	private Set<Consultation> consultations = new HashSet<>();

	public Ordonnance() {
		super();
	}

	public Ordonnance(String medicament, String nombre_medicament, String duree_traitement, String mode_traitement,
			String observation) {
		super();
		this.medicament = medicament;
		this.nombre_medicament = nombre_medicament;
		this.duree_traitement = duree_traitement;
		this.mode_traitement = mode_traitement;
		this.observation = observation;

	}

	public Long getId_ordonnance() {
		return id_ordonnance;
	}

	public void setId_ordonnance(Long id_ordonnance) {
		this.id_ordonnance = id_ordonnance;
	}

	public String getMedicament() {
		return medicament;
	}

	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}

	public String getNombre_medicament() {
		return nombre_medicament;
	}

	public void setNombre_medicament(String nombre_medicament) {
		this.nombre_medicament = nombre_medicament;
	}

	public String getDuree_traitement() {
		return duree_traitement;
	}

	public void setDuree_traitement(String duree_traitement) {
		this.duree_traitement = duree_traitement;
	}

	public String getMode_traitement() {
		return mode_traitement;
	}

	public void setMode_traitement(String mode_traitement) {
		this.mode_traitement = mode_traitement;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public Set<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(Set<Consultation> consultations) {
		this.consultations = consultations;
	}

}
