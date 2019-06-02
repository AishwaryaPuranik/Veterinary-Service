package com.infoway.petclinic.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.infoway.petclinic.dao.VeterinaryRepository;
import com.infoway.petclinic.model.Vet;

@RequestMapping("/vet")
@RestController
public class VeterinaryResources {

	@Autowired
	private VeterinaryRepository veterinaryRepository; 
	
	@PostMapping
	@ResponseStatus
	public Vet createVet(@Valid @RequestBody Vet vet) {
		return veterinaryRepository.save(vet);
	}
	
	
	@GetMapping(value="/{vetID}")
	public Optional<Vet> findVet(@PathVariable("vetID") int vetID ){
		return veterinaryRepository.findById(vetID);
	}
	
	
	@GetMapping
	public List<Vet> findAll() {
		return veterinaryRepository.findAll();
	}
	
	
}
