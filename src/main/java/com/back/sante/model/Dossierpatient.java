package com.back.sante.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author 26134
 *
 */
@Entity
public class Dossierpatient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	Long iddossier;
	Long id;
	String name;
	String username;
	String datenaissance;
	String sexe;
	String adresse;
	String tel;
	String email;
	String type;
	String password;

	Long id_consultation;
	String maladie;
	String resultat;
	String date_consultation;

	Long id_ordonnance;
	String medicament;
	String nombre_medicament;
	String duree_traitement;
	String mode_traitement;
	String observation;
	
	public Long getIddossier() {
		return iddossier;
	}
	public void setIddossier(Long iddossier) {
		this.iddossier = iddossier;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId_consultation() {
		return id_consultation;
	}
	public void setId_consultation(Long id_consultation) {
		this.id_consultation = id_consultation;
	}
	public String getMaladie() {
		return maladie;
	}
	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public String getDate_consultation() {
		return date_consultation;
	}
	public void setDate_consultation(String date_consultation) {
		this.date_consultation = date_consultation;
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
