package com.brodyway.SpringDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="appointment_tbl")
public class Appointment {
	@Id
	@GeneratedValue
	private int id;
	private String doctor;
	private String date;
	private String no_of_slots;
	private String details;
	private String consultation_fee;

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNo_of_slots() {
		return no_of_slots;
	}

	public void setNo_of_slots(String no_of_slots) {
		this.no_of_slots = no_of_slots;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getConsultation_fee() {
		return consultation_fee;
	}

	public void setConsultation_fee(String consultation_fee) {
		this.consultation_fee = consultation_fee;
	}

}
