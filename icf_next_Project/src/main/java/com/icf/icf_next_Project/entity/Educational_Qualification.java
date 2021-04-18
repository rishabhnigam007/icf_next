package com.icf.icf_next_Project.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educational_qualification")
public class Educational_Qualification
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eid;
	@Column(name = "coursetype" ,nullable = false,length = 20)
	private  String courseType;  // part time or full time
	@Column(name = "startdate" ,nullable = false,length = 20)
	private Date startDate;
	@Column(name = "enddate" ,nullable = false,length = 20)
	private Date endDate;
	@Column(name = "institutiontype" ,nullable = false,length = 20)
	private String institutionType;    // government or private
	@Column(name = "institution" ,nullable = false,length = 20)
	private String institution;
	@Column(name = "institutionAddress" ,nullable = false,length = 20)
	private String institutionAddress;
	@Column(name = "percentage" ,nullable = false,length = 20)
	private int percentage;
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
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
	public Educational_Qualification(long eid, String courseType, Date startDate, Date endDate, String institutionType,
			String institution, String institutionAddress, int percentage) {
		super();
		this.eid = eid;
		this.courseType = courseType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.institutionType = institutionType;
		this.institution = institution;
		this.institutionAddress = institutionAddress;
		this.percentage = percentage;
	}
	public Educational_Qualification() {
		super();
	}
	@Override
	public String toString() {
		return "Educational_Qualification [eid=" + eid + ", courseType=" + courseType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", institutionType=" + institutionType + ", institution=" + institution
				+ ", institutionAddress=" + institutionAddress + ", percentage=" + percentage + "]";
	}
	
}