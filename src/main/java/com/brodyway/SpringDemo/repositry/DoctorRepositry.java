package com.brodyway.SpringDemo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brodyway.SpringDemo.model.Doctor;

public interface DoctorRepositry extends JpaRepository<Doctor, Integer> {

}
