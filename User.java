package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_data")
public class User {

	@Id
	@Column(name = "leadId", unique = true)
	private int leadId;

	@Column(name = "firstName", columnDefinition = "TEXT", nullable = false)
	private String firstName;

	@Column(name = "middleName", columnDefinition = "TEXT")
	private String middleName;

	@Column(name = "lastName", columnDefinition = "TEXT", nullable = false)
	private String lastName;

	@Column(name = "mobile", columnDefinition = "BIGINT")
	private long mobile;

	@Column(name = "gender", columnDefinition = "VARCHAR(10)")
	private String gender;

	@Column(name = "dob", columnDefinition = "DATE")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;

	@Column(name = "email", columnDefinition = "VARCHAR(100)")
	private String email;

	public int getLeadId() {
		return leadId;
	}

	public void setLeadId(int leadId) {
		this.leadId = leadId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
