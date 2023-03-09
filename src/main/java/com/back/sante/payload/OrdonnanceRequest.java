package com.back.sante.payload;

import java.util.Set;

public class OrdonnanceRequest {
	private Set<String> consultation;
	private Long id_ordonnance;
	private String medicament;
	private String nombreMedicament;
	private String dureeTraitement;
	private String modeTraitement;
	private String observation;
	public Set<String> getConsultation() {
		return consultation;
	}
	public void setConsultation(Set<String> consultation) {
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

}
