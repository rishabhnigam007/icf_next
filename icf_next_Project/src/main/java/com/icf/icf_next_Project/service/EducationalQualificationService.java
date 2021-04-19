package com.icf.icf_next_Project.service;

import javax.validation.Valid;

import com.icf.icf_next_Project.entity.Educational_Qualification;
import com.icf.icf_next_Project.request.Educational_Qualification_Request;

public interface EducationalQualificationService 
{

	public Educational_Qualification registerEducation(@Valid Educational_Qualification_Request eqr);

}