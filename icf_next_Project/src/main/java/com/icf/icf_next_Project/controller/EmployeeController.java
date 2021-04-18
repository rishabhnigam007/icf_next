package com.icf.icf_next_Project.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.icf.icf_next_Project.entity.Employee_Registeration;
import com.icf.icf_next_Project.exception.EmployeeNotfoundException;
import com.icf.icf_next_Project.request.EmployeeLoginRequest;
import com.icf.icf_next_Project.request.Employee_Registeration_Request;
import com.icf.icf_next_Project.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired(required = true)
	private EmployeeService es;
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@Valid @RequestBody Employee_Registeration_Request err)
	{
		Employee_Registeration er=es.register(err);
		return new ResponseEntity<>("Employee is created successfully with Employementid : "+er.getEmployementId(),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Object> isEmployeeExists(@Valid @RequestBody EmployeeLoginRequest elr)
	{
		int isEmployeeExist =es.isEmployeeExists(elr.getFname(),elr.getLname(),elr.getEmployementId());
		if(isEmployeeExist>0)
		{
			return new ResponseEntity<>("Employee successfully login with -->"+"\n"+"EmployementID : "+elr.getEmployementId() +"\nFirst Name : " + elr.getFname()+"\nLast Name : "+elr.getLname(),HttpStatus.OK);
		}
		else
		{
			throw new EmployeeNotfoundException();
		}
	}
	
//	@GetMapping("/allemployees")
//	public 
}