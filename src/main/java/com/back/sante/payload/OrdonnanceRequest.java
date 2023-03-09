package com.back.sante.payload;

import java.util.Set;

public class OrdonnanceRequest {
	private Long consultation;
	private Long id_ordonnance;
	private String medicament;
	private String nombre_medicament;
	private String duree_traitement;
	private String mode_traitement;
	private String observation;
	
	public Long getConsultation() {
		return consultation;
	}
	public void setConsultation(Long consultation) {
		this.consultation = consultation;
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

}
