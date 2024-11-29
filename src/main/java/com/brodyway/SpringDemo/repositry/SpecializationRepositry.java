package com.brodyway.SpringDemo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brodyway.SpringDemo.model.Specialization;

public interface SpecializationRepositry extends JpaRepository<Specialization, Integer> {

}
