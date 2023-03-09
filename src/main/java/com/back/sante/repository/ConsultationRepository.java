package com.back.sante.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.sante.model.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
	Optional <Consultation> findById(Long id);
}
