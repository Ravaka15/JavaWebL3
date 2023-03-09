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
	Long id_consultation;
	String maladie;
	String resultat;
	String date_consultation;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "patient_consultation", 
				joinColumns = @JoinColumn(name = "consultation_id"), 
				inverseJoinColumns = @JoinColumn(name = "user_id"))
	
	
	private Set<User> users = new HashSet<>();

	public Consultation() {
		super();
	}
	
	public Consultation(String maladie, String resultat, String date_consultation
			) {
		super();
		this.maladie = maladie;
		this.resultat = resultat;
		this.date_consultation = date_consultation;
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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	
}
