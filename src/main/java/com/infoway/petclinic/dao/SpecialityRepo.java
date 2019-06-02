package com.infoway.petclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoway.petclinic.model.Speciality;

public interface SpecialityRepo extends JpaRepository<Speciality, Integer>{

}
