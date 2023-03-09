package com.back.sante.payload;

import java.util.Set;

public class ConsultationRequest {
	private Long user;
	private Long id_consultation;
	private String maladie;
	private String resultat;
	private String date_consultation;

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
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

}
