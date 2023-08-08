package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService{

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		
		return IValidationService.super.validateUsername(username);
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		return IValidationService.super.validatePassword(password);
	}

	
}
