package com.brodyway.SpringDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_tbl")
public class Patient {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String gender;
	private String phone;
	private String dob;
	private String marial_Status;
	private String present_address;
	private String communication_address;
	private String past_medical_history;
	private String other_details;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMarial_Status() {
		return marial_Status;
	}

	public void setMarial_Status(String marial_Status) {
		this.marial_Status = marial_Status;
	}

	public String getPresent_address() {
		return present_address;
	}

	public void setPresent_address(String present_address) {
		this.present_address = present_address;
	}

	public String getCommunication_address() {
		return communication_address;
	}

	public void setCommunication_address(String communication_address) {
		this.communication_address = communication_address;
	}

	public String getPast_medical_history() {
		return past_medical_history;
	}

	public void setPast_medical_history(String past_medical_history) {
		this.past_medical_history = past_medical_history;
	}

	public String getOther_details() {
		return other_details;
	}

	public void setOther_details(String other_details) {
		this.other_details = other_details;
	}

}
