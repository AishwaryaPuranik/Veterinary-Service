package com.infoway.petclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.infoway.petclinic.dao.SpecialityRepo;
import com.infoway.petclinic.dao.VeterinaryRepository;
import com.infoway.petclinic.model.Speciality;
import com.infoway.petclinic.model.Vet;

@SpringBootApplication
public class VeterinaryServiceApplication {

	@Autowired
	private VeterinaryRepository repo;
	
	@Autowired
	private SpecialityRepo srepo;
	public static void main(String[] args) {
		SpringApplication.run(VeterinaryServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				System.out.println("Welcome To Veterinary");
				Speciality spec= new Speciality();
				spec.setName("Surgeon");
				Vet vet = new Vet();
				vet.setFirstName("Mayur");
				vet.setLastName("Desale");
				vet.setAddress("Nashik");
				vet.setCity("Nashik");
				vet.setTelephone("0987654321");
				vet.setSpeciality(spec);
				repo.save(vet);
				
				
				
				Speciality spec1= new Speciality();
				spec1.setName("Operational");
				Vet vet1 = new Vet();
				vet1.setFirstName("Mayur");
				vet1.setLastName("Desale");
				vet1.setAddress("Nashik");
				vet1.setCity("Nashik");
				vet1.setTelephone("0987654321");
				vet1.setSpeciality(spec1);
				repo.save(vet1);
				
				
				
			}
		};
	}

}
