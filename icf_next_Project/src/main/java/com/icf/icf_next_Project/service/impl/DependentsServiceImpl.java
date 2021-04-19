package com.icf.icf_next_Project.service.impl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icf.icf_next_Project.dao.DependentsRepository;
import com.icf.icf_next_Project.entity.Dependents;
import com.icf.icf_next_Project.request.DependentsRequest;
import com.icf.icf_next_Project.service.DependentsService;

@Service
public class DependentsServiceImpl implements DependentsService 
{

	@Autowired(required = true)
	private DependentsRepository drepo;
	
	@Override
	public Dependents registerdependent(@Valid DependentsRequest dr) 
	{
		Dependents d=new Dependents();
		d.setFirstName(dr.getFirstName());
		d.setLastName(dr.getLastName());
		d.setGender(dr.getGender());
		d.setRelationship(dr.getRelationship());
		d.setDob(dr.getDob());
		return drepo.save(d);
	}

}