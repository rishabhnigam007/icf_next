package com.icf.icf_next_Project.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "employee_registeration")
@Data
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
	
	
}