package com.back.sante.repository;

import com.back.sante.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long>{
	Optional <User> findByEmail(String email);
	Optional <User> findById(Long id);
	Boolean existsByUsername(String name);
	Boolean existsByEmail(String email);
	
	List<User> findByType(String type);
	
	@Query("select u from User u where u.type='Patient' and (u.name like %:recherche% or u.username like %:recherche% or u.sexe like %:recherche% or u.adresse like %:recherche%)")
	List<User> findByPatient(@Param("recherche") String recherche);
		
		

}
