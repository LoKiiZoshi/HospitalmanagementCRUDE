package com.brodyway.SpringDemo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brodyway.SpringDemo.model.Appointment;

public interface AppointmentRepositry extends JpaRepository<Appointment, Integer> {

}
