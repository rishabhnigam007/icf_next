package com.icf.icf_next_Project.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.icf.icf_next_Project.entity.Educational_Qualification;
import com.icf.icf_next_Project.request.Educational_Qualification_Request;
import com.icf.icf_next_Project.service.EducationalQualificationService;

@RestController
public class EducationalQualificationController 
{
	@Autowired(required = true)
	private EducationalQualificationService eqs;
	
	@PostMapping("/registereducation")
	public ResponseEntity<Object> registerEducationQualification(@Valid @RequestBody Educational_Qualification_Request eqr)
	{
		Educational_Qualification eq=eqs.registerEducation(eqr);
		return new ResponseEntity<>("Educational Qualification Filled Successfully with Detail : "+"\n"+eq.toString(),HttpStatus.CREATED);
	}
}