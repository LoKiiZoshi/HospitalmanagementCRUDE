package com.brodyway.SpringDemo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brodyway.SpringDemo.model.Patient;

public interface PatientRepositry extends JpaRepository<Patient, Integer> {

}
