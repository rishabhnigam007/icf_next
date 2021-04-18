package com.icf.icf_next_Project.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_registeration")
public class Employee_Registeration 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "employementid",length = 20,nullable = false)
	private int employementId;
	@Column(name = "reportingmanagerid",length = 20,nullable = false)
	private int reportingManagerId;
	@Column(name = "fname",length = 15 ,nullable = false)
	private String fName;
	@Column(name = "lname",length = 15 ,nullable = false)
	private String lName;
	@Column(name = "designation",length = 25,nullable = false)
	private String designation;
	@Column(name = "department",length = 25 ,nullable = false)
	private String department;
	@Column(name = "status",length = 15 ,nullable = false)
	private String status;
	@Column(name = "gender",length = 1,nullable = false)
	private String gender;
	@Column(name = "bloodgroup",length = 2 ,nullable = false)
	private String bloodGroup;
	@Column(name = "address",length = 50 ,nullable = false)
	private String address;
	@Column(name = "dob",length = 10,nullable = false)
	private Date dob;
	@Column(name = "startdate",length = 10 ,nullable = false)
	private Date startDate;
	@Column(name = "enddate",length = 10 ,nullable = false)
	private Date endDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getEmployementId() {
		return employementId;
	}
	public void setEmployementId(int employementId) {
		this.employementId = employementId;
	}
	public int getReportingManagerId() {
		return reportingManagerId;
	}
	public void setReportingManagerId(int reportingManagerId) {
		this.reportingManagerId = reportingManagerId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public Employee_Registeration(long id, int employementId, int reportingManagerId, String fName, String lName,
			String designation, String department, String status, String gender, String bloodGroup, String address,
			Date dob, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.employementId = employementId;
		this.reportingManagerId = reportingManagerId;
		this.fName = fName;
		this.lName = lName;
		this.designation = designation;
		this.department = department;
		this.status = status;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.dob = dob;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Employee_Registeration() {
		super();
	}
	@Override
	public String toString() {
		return "Employee_Registeration [id=" + id + ", employementId=" + employementId + ", reportingManagerId="
				+ reportingManagerId + ", fName=" + fName + ", lName=" + lName + ", designation=" + designation
				+ ", department=" + department + ", status=" + status + ", gender=" + gender + ", bloodGroup="
				+ bloodGroup + ", address=" + address + ", dob=" + dob + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}	
	
}