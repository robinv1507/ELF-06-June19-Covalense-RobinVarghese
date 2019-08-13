package com.covalense.emp.beans;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee_otherinfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeOtherInfoBean implements Serializable {

	//@XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	private EmployeeInfoBean infoBean;
	@Column(name = "ISMARRIED")
	private boolean ismarried;
	@Column(name = "PAN ")
	private String pan;
	@Column(name = "BLOOD_GROUP ")
	private String bloodGrp;
	@Column(name = "ISCHALLENGED")
	private boolean isChallenged;
	@Column(name = "EMERGENCY_NUMBER")
	private long emergencyContactNumber;
	@Column(name = "EMERGENCY_CONTACT_NAME")
	private String emergencyContactName;
	@Column(name = "NATIONALITY")
	private String nationality;
	@Column(name = "RELIGION")
	private String religion;
	@Column(name = "FATHER_NM")
	private String fatherName;
	@Column(name = "MOTHER_NM")
	private String motherName;
	@Column(name = "PASSPORT")
	private long passport;
	@Column(name = "ADHAAR")
	private long adhar;
	@Column(name = "SPOUSE_NM")
	private String spouseName;
	
	// getters and setters
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public boolean isIsmarried() {
		return ismarried;
	}
	public void setIsmarried(boolean ismarried) {
		this.ismarried = ismarried;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getBloodGrp() {
		return bloodGrp;
	}
	public void setBloodGrp(String bloodGrp) {
		this.bloodGrp = bloodGrp;
	}
	public boolean isChallenged() {
		return isChallenged;
	}
	public void setChallenged(boolean isChallenged) {
		this.isChallenged = isChallenged;
	}
	public long getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	public void setEmergencyContactNumber(long emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	public String getEmergencyContactName() {
		return emergencyContactName;
	}
	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public long getPassport() {
		return passport;
	}
	public void setPassport(long passport) {
		this.passport = passport;
	}
	public long getAdhar() {
		return adhar;
	}
	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	
	

}// end of class
