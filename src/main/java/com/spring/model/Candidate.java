package com.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Candidate {

	private String candidateName;
	private Date candidateDob;
	private String candidateEmail;
	private List<String> candidateSkills;
	private String candidateGender;
	private String employmentType;

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public Date getCandidateDob() {
		return candidateDob;
	}

	public void setCandidateDob(Date candidateDob) {
		this.candidateDob = candidateDob;
	}

	public String getCandidateEmail() {
		return candidateEmail;
	}

	public void setCandidateEmail(String candidateEmail) {
		this.candidateEmail = candidateEmail;
	}

	public List<String> getCandidateSkills() {
		return candidateSkills;
	}

	public void setCandidateSkills(List<String> candidateSkills) {
		this.candidateSkills = candidateSkills;
	}

	public String getCandidateGender() {
		return candidateGender;
	}

	public void setCandidateGender(String candidateGender) {
		this.candidateGender = candidateGender;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	@Override
	public String toString() {
		return "Candidate [candidateName=" + candidateName + ", candidateDob=" + candidateDob + ", candidateEmail="
				+ candidateEmail + ", candidateSkills=" + candidateSkills + ", candidateGender=" + candidateGender
				+ ", employmentType=" + employmentType + "]";
	}

}
