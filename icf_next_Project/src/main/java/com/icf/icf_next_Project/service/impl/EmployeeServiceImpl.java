package com.icf.icf_next_Project.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icf.icf_next_Project.dao.EmployeeRepository;
import com.icf.icf_next_Project.entity.Employee_Registeration;
import com.icf.icf_next_Project.exception.EmployementIdAlreadyExistException;
import com.icf.icf_next_Project.request.Employee_Registeration_Request;
import com.icf.icf_next_Project.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	@Autowired(required = true)
	private EmployeeRepository er;
	
	@Override
	public Employee_Registeration register(@Valid Employee_Registeration_Request reg) 
	{
		Employee_Registeration e=new Employee_Registeration();
		e.setfName(reg.getfName());
		e.setlName(reg.getlName());
		e.setReportingManagerId(reg.getReportingManagerId());
		if(er.findByEmployementId(reg.getEmployementId())<1)
		{
			e.setEmployementId(reg.getEmployementId());
		}
		else
		{
			throw new EmployementIdAlreadyExistException();
		}
		e.setDesignation(reg.getDesignation());
		e.setDepartment(reg.getDepartment());
		e.setStatus(reg.getStatus());
		e.setGender(reg.getGender());
		e.setBloodGroup(reg.getBloodGroup());
		e.setAddress(reg.getAddress());
		e.setDob(reg.getDob());
		e.setStartDate(reg.getStartDate());
		e.setEndDate(reg.getEndDate());
		return er.save(e);
	}

	@Override
	public int isEmployeeExists(@Valid String fname, String lname, int employementid) 
	{
		return er.existsById(fname, lname, employementid);
	}

}