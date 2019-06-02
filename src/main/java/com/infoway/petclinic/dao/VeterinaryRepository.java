package com.infoway.petclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoway.petclinic.model.Vet;

public interface VeterinaryRepository extends JpaRepository<Vet, Integer> {

}
