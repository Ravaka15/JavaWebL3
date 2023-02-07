package com.back.sante.exception;

public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(Long id) {
		super("id not found" + id);
	}
}
