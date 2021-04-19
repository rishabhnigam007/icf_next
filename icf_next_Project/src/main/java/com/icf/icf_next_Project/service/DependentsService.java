package com.icf.icf_next_Project.service;

import javax.validation.Valid;

import com.icf.icf_next_Project.entity.Dependents;
import com.icf.icf_next_Project.request.DependentsRequest;

public interface DependentsService 
{
	public Dependents registerdependent(@Valid DependentsRequest dr);
	
}