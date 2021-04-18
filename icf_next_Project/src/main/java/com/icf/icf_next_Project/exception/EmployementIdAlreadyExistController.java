package com.icf.icf_next_Project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployementIdAlreadyExistController
{
	@ExceptionHandler(value =EmployementIdAlreadyExistException.class)
	public ResponseEntity<Object> exception(EmployementIdAlreadyExistException exception) 
	{
		return new ResponseEntity<>("EmployementId already Exist please insert new EmployementId", HttpStatus.NOT_FOUND);
	}
}