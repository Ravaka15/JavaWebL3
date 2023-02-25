package com.back.sante.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.back.sante.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String username;

	private String datenaissance;

	private String sexe;

	private String adresse;

	private String tel;

	private String email;

	private String type;

	@JsonIgnore
	private String password;
	
	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long id, String name, String username, String datenaissance, String sexe, String adresse,
			String tel, String email, String type, String password,
			Collection<? extends GrantedAuthority> authorities) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.datenaissance = datenaissance;
		this.sexe = sexe;
		this.adresse = adresse;
		this.tel = tel;
		this.email = email;
		this.type = type;
		this.password = password;
		this.authorities = authorities;

	}

	public static UserDetailsImpl build(User user) {
		List<GrantedAuthority> authorities = user.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getName().name()))
				.collect(Collectors.toList());
		
		System.out.println("itititio"+authorities);
		
		return new UserDetailsImpl(
				user.getId(),
				user.getName(),
				user.getUsername(),
				user.getDatenaissance(),
				user.getSexe(),
				user.getAdresse(),
				user.getTel(),
				user.getEmail(),
				user.getType(),
				user.getPassword(),
				authorities);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return authorities;
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

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(id, user.id);
	}

	
}