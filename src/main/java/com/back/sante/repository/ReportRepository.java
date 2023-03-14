package com.back.sante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.sante.model.Dossierpatient;

public interface ReportRepository extends JpaRepository<Dossierpatient,Long> {
//	@Query("SELECT * FROM user INNER JOIN consultation ON user.id=consultation.id_consultation INNER JOIN ordonnance ON consultation.id_consultation=ordonnance.id_ordonnance")
//	List<Dossierpatient> findAll();
//	
}
