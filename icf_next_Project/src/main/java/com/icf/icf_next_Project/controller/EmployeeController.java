package com.icf.icf_next_Project.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.icf.icf_next_Project.dao.EmployeeRepository;
import com.icf.icf_next_Project.entity.Employee_Registeration;
import com.icf.icf_next_Project.exception.EmployeeNotfoundException;
import com.icf.icf_next_Project.request.EmployeeLoginRequest;
import com.icf.icf_next_Project.request.Employee_Registeration_Request;
import com.icf.icf_next_Project.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class EmployeeController 
{
	@Autowired(required = true)
	private EmployeeService es;
	
	@Autowired(required = true)
	private EmployeeRepository er;
	
	@GetMapping("/")
	public String home()
	{
		return "<h1><center>Welcome </br> You Are Successfully Login..!!</center></h1>";
	}
	
	public Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	/* ---   Create Operation Perform   --- */
	/* ---   Registeration Module Completed   --- */
	
	@PostMapping("/register")
	public ResponseEntity<Object> register(@Valid @RequestBody Employee_Registeration_Request err)
	{
		logger.trace("Employee Registeration Started..!!");
		Employee_Registeration er=es.register(err);
		return new ResponseEntity<>("Employee is created successfully with Employementid : "+er.getEmployementId(),HttpStatus.CREATED);
	}
	
	/* ---   Read Operation Perform   --- */
	/* ---   Login Module Completed   --- */
	
	@PostMapping("/login")
	public ResponseEntity<Object> isEmployeeExists(@Valid @RequestBody EmployeeLoginRequest elr)
	{
		int isEmployeeExist =es.isEmployeeExists(elr.getFname(),elr.getLname(),elr.getEmployementId());
		if(isEmployeeExist>0)
		{
			logger.trace("Employee Login..!!");
			return new ResponseEntity<>("Employee successfully login with -->"+"\n"+"EmployementID : "+elr.getEmployementId() +"\nFirst Name : " + elr.getFname()+"\nLast Name : "+elr.getLname(),HttpStatus.OK);
		}
		else
		{
			logger.trace("Employee Not Login..!!");
			throw new EmployeeNotfoundException();
		}
	}
	
	/* ---   Read Operation Perform   --- */
	/* ---   All Employee Fetch   --- */
	
	@GetMapping("/allemployees")
	public String getAllEmployee()
	{
		logger.trace("List of all Employee..!!");
		return er.findAll().toString();
	}
	
	/* ---   Read Operation Perform   --- */
	/* ---   Get Specific Employee By Id   --- */
	
	@GetMapping("/getbyid/{id}")
	public String getEmployeeById(@PathVariable("id") long id)
	{
		logger.trace("Employee Check by ID..!!");
		return es.getEmployeeById(id);
	}
	
	/* ---   Delete Operation Perform   --- */
	/* ---   Delete By Specific Id   --- */
	
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable("id") long id)
	{
		try
		{
			er.deleteById(id);
			logger.trace("Employee Delete by ID..!!");
			return new ResponseEntity<>("Employee successfully deleted by Id : "+id,HttpStatus.OK);
		}
		catch (Exception e) 
		{
			logger.trace("Employee Delete by ID is not Successfull..!!");
			throw new EmployeeNotfoundException();
		}
	}
	
	/* ---   Delete Operation Perform   --- */
	/* ---   Delete All Employee   --- */
	
	@DeleteMapping("/alldelete")
	public ResponseEntity<Object> allDelete()
	{
		try
		{
			long x=er.count();
			if(x>0)
			{
				er.deleteAll();
				logger.trace("All Employee Deleted..!!");
				return new ResponseEntity<>("All Employee successfully Deleted !! ",HttpStatus.OK);
			}
			else
			{
				logger.trace("All Employee Not Deleted..!!");
				throw new EmployeeNotfoundException();
			}
		}
		catch (Exception e) 
		{
			logger.trace("Employee Not Found..!!");
			throw new EmployeeNotfoundException();
		}
	}
	
	/* ---   Update Operation Perform   --- */
	/* ---   Update By Specific Id   --- */
	
	@PutMapping("/update/{id}")
	public Employee_Registeration updateEmployee(@Valid @RequestBody Employee_Registeration err, @PathVariable("id") long id)
	{
		logger.trace("Employee Update by ID..!!");
		return es.update(err,id);
	}
	
}