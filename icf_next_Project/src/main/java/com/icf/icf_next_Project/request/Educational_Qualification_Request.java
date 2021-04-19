package com.icf.icf_next_Project.request;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

public class Educational_Qualification_Request 
{
	@NotEmpty(message = "Course Type cant be null")
	@NotEmpty(message = "Course Type cant be empty")
	private  String courseType;  // part time or full time
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@NotEmpty(message = "Institution Type cant be null")
	@NotEmpty(message = "Institution Type cant be empty")
	private String institutionType;    // government or private
	@NotEmpty(message = "Institution cant be null")
	@NotEmpty(message = "Institution cant be empty")
	private String institution;
	@NotEmpty(message = "Institution Address cant be null")
	@NotEmpty(message = "Institution Address cant be empty")
	private String institutionAddress;
	private int percentage;
	
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getInstitutionAddress() {
		return institutionAddress;
	}
	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public Educational_Qualification_Request(
			@NotEmpty(message = "Course Type cant be null") @NotEmpty(message = "Course Type cant be empty") String courseType,
			Date startDate, Date endDate,
			@NotEmpty(message = "Institution Type cant be null") @NotEmpty(message = "Institution Type cant be empty") String institutionType,
			@NotEmpty(message = "Institution cant be null") @NotEmpty(message = "Institution cant be empty") String institution,
			@NotEmpty(message = "Institution Address cant be null") @NotEmpty(message = "Institution Address cant be empty") String institutionAddress,
			int percentage) {
		super();
		this.courseType = courseType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.institutionType = institutionType;
		this.institution = institution;
		this.institutionAddress = institutionAddress;
		this.percentage = percentage;
	}
	public Educational_Qualification_Request() {
		super();
	}
	@Override
	public String toString() {
		return "Educational_Qualification_Request [courseType=" + courseType + ", startDate=" + startDate + ", endDate="
				+ endDate + ", institutionType=" + institutionType + ", institution=" + institution
				+ ", institutionAddress=" + institutionAddress + ", percentage=" + percentage + "]";
	}
	
}