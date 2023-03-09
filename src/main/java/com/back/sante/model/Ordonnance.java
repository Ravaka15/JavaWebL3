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
	String nombreMedicament;
	String dureeTraitement;
	String modeTraitement;
	String observation;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "consultation_ordonnance", joinColumns = @JoinColumn(name = "ordonnance_id"),
	inverseJoinColumns = @JoinColumn(name = "consultation_id"))

	private Set<Consultation> consultations = new HashSet<>();

	public Ordonnance() {
		super();
	}

	public Ordonnance(String medicament, String nombreMedicament, String dureeTraitement, String modeTraitement,
			String observation) {
		super();
		this.medicament = medicament;
		this.nombreMedicament = nombreMedicament;
		this.dureeTraitement = dureeTraitement;
		this.modeTraitement = modeTraitement;
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

	public String getNombreMedicament() {
		return nombreMedicament;
	}

	public void setNombreMedicament(String nombreMedicament) {
		this.nombreMedicament = nombreMedicament;
	}

	public String getDureeTraitement() {
		return dureeTraitement;
	}

	public void setDureeTraitement(String dureeTraitement) {
		this.dureeTraitement = dureeTraitement;
	}

	public String getModeTraitement() {
		return modeTraitement;
	}

	public void setModeTraitement(String modeTraitement) {
		this.modeTraitement = modeTraitement;
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
