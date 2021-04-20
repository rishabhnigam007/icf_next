package com.icf.icf_next_Project.service.impl;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icf.icf_next_Project.dao.EducationalQualificationRepository;
import com.icf.icf_next_Project.entity.Educational_Qualification;
import com.icf.icf_next_Project.entity.Employee_Registeration;
import com.icf.icf_next_Project.request.Educational_Qualification_Request;
import com.icf.icf_next_Project.service.EducationalQualificationService;

@Service
public class EducationalQualificationServiceImpl implements EducationalQualificationService
{

	@Autowired(required = true)
	private EducationalQualificationRepository eqrepo;
	
	@Autowired(required = true)
	private Employee_Registeration er;
	
	@Override
	public Educational_Qualification registerEducation(@Valid Educational_Qualification_Request eqr) 
	{
		Educational_Qualification equQualification=new Educational_Qualification();
		equQualification.setCourseType(eqr.getCourseType());
		equQualification.setInstitution(eqr.getInstitution());
		equQualification.setInstitutionType(eqr.getInstitutionType());
		equQualification.setInstitutionAddress(eqr.getInstitutionAddress());
		equQualification.setPercentage(eqr.getPercentage());
		equQualification.setStartDate(eqr.getStartDate());
		equQualification.setEndDate(eqr.getEndDate());
//		er.find
//		equQualification.setId();
		return eqrepo.save(equQualification);
	}
}