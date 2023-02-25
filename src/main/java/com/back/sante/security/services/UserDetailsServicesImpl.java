package com.back.sante.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.back.sante.model.User;
import com.back.sante.repository.UserRepository;

@Service
public class UserDetailsServicesImpl implements UserDetailsService {
	@Autowired
	UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(name)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + name));
		return UserDetailsImpl.build(user);
	}

}