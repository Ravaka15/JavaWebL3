package com.back.sante.repository;

import com.back.sante.model.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
	Optional <User> findByEmail(String email);
	Boolean existsByUsername(String name);
	Boolean existsByEmail(String email);
	
	List<User> findByType(String type);
}
