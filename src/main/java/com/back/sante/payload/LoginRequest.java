package com.back.sante.payload;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
  private String name;

	@NotBlank
	private String password;

	public String getName() {
		return name;
	}

	public void setUsername(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
