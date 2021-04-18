package com.icf.icf_next_Project.request;

import javax.validation.constraints.NotEmpty;

public class EmployeeLoginRequest 
{
	@NotEmpty(message = "first name cant be null")
	@NotEmpty(message = "first name cant be empty")
	private String fname;
	@NotEmpty(message = "last name cant be null")
	@NotEmpty(message = "last name cant be empty")
	private String lname;
	private int employementId;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEmployementId() {
		return employementId;
	}
	public void setEmployementId(int employementId) {
		this.employementId = employementId;
	}
	public EmployeeLoginRequest(
			@NotEmpty(message = "first name cant be null") @NotEmpty(message = "first name cant be empty") String fname,
			@NotEmpty(message = "last name cant be null") @NotEmpty(message = "last name cant be empty") String lname,
			@NotEmpty(message = "employementId cant be null") @NotEmpty(message = "employementId cant be empty") int employementId) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.employementId = employementId;
	}
	public EmployeeLoginRequest() {
		super();
	}
	@Override
	public String toString() {
		return "EmployeeLoginRequest [fname=" + fname + ", lname=" + lname + ", employementId=" + employementId + "]";
	}
	
	
}