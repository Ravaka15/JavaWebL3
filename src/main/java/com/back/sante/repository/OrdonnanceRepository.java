package com.back.sante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.back.sante.model.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long>{
	
	
}
