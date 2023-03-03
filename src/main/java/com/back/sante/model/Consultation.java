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
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idConsultation;
	String maladie;
	String resultat;
	String dateConsultation;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "patient_consultation", 
				joinColumns = @JoinColumn(name = "consultation_id"), 
				inverseJoinColumns = @JoinColumn(name = "user_id"))
	
	
	private Set<User> users = new HashSet<>();

	public Consultation() {
		super();
	}
	
	public Consultation(String maladie, String resultat, String dateConsultation
			) {
		super();
		this.maladie = maladie;
		this.resultat = resultat;
		this.dateConsultation = dateConsultation;
	}
	public Long getIdConsultation() {
		return idConsultation;
	}

	public void setIdConsultation(Long idConsultation) {
		this.idConsultation = idConsultation;
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

	public String getDateConsultation() {
		return dateConsultation;
	}

	public void setDateConsultation(String dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	
}
